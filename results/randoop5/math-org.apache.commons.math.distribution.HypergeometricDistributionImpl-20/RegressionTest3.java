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
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(95, 128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1, 100);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability(100);
        double double15 = hypergeometricDistributionImpl3.probability(0.0d);
        double double17 = hypergeometricDistributionImpl3.probability((int) '#');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(10, (int) '4', 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability(93, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        hypergeometricDistributionImpl3.setSampleSize(32);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(33);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.lang.Class<?> wildcardClass20 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', 35);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double24 = hypergeometricDistributionImpl3.probability(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.probability((double) 35);
        hypergeometricDistributionImpl3.setPopulationSize(25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.probability(0.0d);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.09999999999999998d, (double) (short) 100);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.10309278350515466d);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09999999999999998d + "'", double7 == 0.09999999999999998d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(35);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double16 = hypergeometricDistributionImpl3.probability(100.0d);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.probability(0.97d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double20 = hypergeometricDistributionImpl3.probability((double) 89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', 128);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96, (double) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double19 = hypergeometricDistributionImpl3.probability(128);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.probability(33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(98, 1, (int) (byte) 1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        double double19 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (byte) 0);
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.probability(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d, (double) 100);
        double double12 = hypergeometricDistributionImpl3.probability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.97d + "'", double10 == 0.97d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9699999999999995d + "'", double12 == 0.9699999999999995d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        double double18 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(99);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double16 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double18 = hypergeometricDistributionImpl3.probability((double) 100);
        double double20 = hypergeometricDistributionImpl3.probability(52);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(6);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(9, 95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 0.97d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(35);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(9);
        double double18 = hypergeometricDistributionImpl3.probability((double) 95);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
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
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        double double19 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        java.lang.Class<?> wildcardClass24 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(93);
        double double19 = hypergeometricDistributionImpl3.probability(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability(97);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        double double23 = hypergeometricDistributionImpl3.probability(0.0d);
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 105 + "'", int21 == 105);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 32, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, 105);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.02999999999999997d + "'", double14 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(99, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 1);
        double double17 = hypergeometricDistributionImpl3.probability(52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10, 95);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability(0.0d);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(35, (int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double17 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double18 = hypergeometricDistributionImpl3.probability((double) 100);
        double double20 = hypergeometricDistributionImpl3.probability(26);
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double22 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize(6);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.probability((double) 95);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double15 = hypergeometricDistributionImpl3.probability((double) 10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.probability(0.0d);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 105);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) 35);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8999999999999996d);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        int int23 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0.10309278350515466d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 98);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, 0, 96);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) 10L);
        java.lang.Class<?> wildcardClass8 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability(32);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 32, (int) (short) 10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) (short) 0);
        double double28 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 105 + "'", int21 == 105);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95, (double) 95);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        java.lang.Class<?> wildcardClass22 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(89);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability(100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.97d, (double) '4');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 26);
        double double24 = hypergeometricDistributionImpl3.probability((double) 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', 95, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(6);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 10L);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 35);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f), (double) (byte) 10);
        double double19 = hypergeometricDistributionImpl3.probability((double) 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double24 = hypergeometricDistributionImpl3.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double21 = hypergeometricDistributionImpl3.probability(52);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L));
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setSampleSize(25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((double) 9);
        double double9 = hypergeometricDistributionImpl3.probability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) '#');
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double21 = hypergeometricDistributionImpl3.probability(1);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        double double25 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double27 = hypergeometricDistributionImpl3.probability(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 105 + "'", int21 == 105);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 0, (int) ' ');
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        double double7 = hypergeometricDistributionImpl3.probability(94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double11 = hypergeometricDistributionImpl3.probability((double) '4');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(9, (int) (short) 10, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09999999999999998d + "'", double7 == 0.09999999999999998d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 93);
        double double15 = hypergeometricDistributionImpl3.probability(10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        double double19 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 105, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.probability((-1));
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) (short) -1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, 0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.probability((double) 89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(89);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setSampleSize(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability(0.0d);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.probability((int) '4');
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(25, 35, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(128, (int) (short) 0, 94);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(98);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 95 + "'", int17 == 95);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(6);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double12 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        double double14 = hypergeometricDistributionImpl3.probability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability(0.10309278350515466d);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability(93);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 35, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.probability(100);
        hypergeometricDistributionImpl3.setPopulationSize(96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double19 = hypergeometricDistributionImpl3.probability(6);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96, (double) 98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(94, 97, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        hypergeometricDistributionImpl3.setSampleSize(95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double19 = hypergeometricDistributionImpl3.probability((double) 98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double18 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.probability(10);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(8, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, (int) (short) 100, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability(1);
        hypergeometricDistributionImpl3.setPopulationSize(25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        hypergeometricDistributionImpl3.setSampleSize(95);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 95 + "'", int16 == 95);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.probability((double) '4');
        hypergeometricDistributionImpl3.setPopulationSize(10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, (double) 10L);
        double double11 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8999999999999996d + "'", double6 == 0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, (int) (byte) 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '#', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, (int) (byte) 100);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability(97);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        double double19 = hypergeometricDistributionImpl3.probability((int) '4');
        hypergeometricDistributionImpl3.setSampleSize(8);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10, 95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double15 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize(89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) ' ');
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize(128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) ' ');
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        double double22 = hypergeometricDistributionImpl3.probability(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setSampleSize(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability(10.0d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, 0.02999999999999997d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 95 + "'", int17 == 95);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double9 = hypergeometricDistributionImpl3.probability(0.0d);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double17 = hypergeometricDistributionImpl3.probability((double) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(93);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.probability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.8969072164948454d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double17 = hypergeometricDistributionImpl3.probability(0.0d);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability(94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        int int27 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 33, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize(95);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(99, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, (int) (byte) -1, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double17 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) (short) 100);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', 95, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 33);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability(93, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(9);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(128, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(94, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8999999999999996d + "'", double6 == 0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', 1, 93);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.probability((double) 35);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setSampleSize(94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 98, (int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(93);
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        double double19 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95, (double) 95);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 98);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(105);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, 100.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(105);
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 32);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability(100);
        hypergeometricDistributionImpl3.setSampleSize(98);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, 0.02999999999999997d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        double double15 = hypergeometricDistributionImpl3.probability((double) 98);
        hypergeometricDistributionImpl3.setPopulationSize(9);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 128);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability(32, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 0, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0, 25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        double double15 = hypergeometricDistributionImpl3.probability((-1));
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        double double18 = hypergeometricDistributionImpl3.probability((double) 10L);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) 35);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double15 = hypergeometricDistributionImpl3.probability((double) 10);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double16 = hypergeometricDistributionImpl3.probability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        java.lang.Class<?> wildcardClass25 = hypergeometricDistributionImpl3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability(96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(105, (int) (short) 1, 1);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability(99, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        java.lang.Class<?> wildcardClass20 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double20 = hypergeometricDistributionImpl3.probability((double) 93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        hypergeometricDistributionImpl3.setSampleSize(105);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(93);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) 89);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 95 + "'", int21 == 95);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ', 95);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(93, 26, (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0, 33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        double double10 = hypergeometricDistributionImpl3.probability((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, 100.0d);
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass7 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double20 = hypergeometricDistributionImpl3.probability(26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(97, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(8, 94);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double10 = hypergeometricDistributionImpl3.probability(98);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 95);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setSampleSize(52);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 89, 0.09999999999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(33, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(26, (int) (short) 100, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 89 + "'", int13 == 89);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        double double10 = hypergeometricDistributionImpl3.probability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double11 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setSampleSize(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(100, (int) (byte) 100);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double20 = hypergeometricDistributionImpl3.probability((double) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.probability((double) 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 9, (double) 89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double11 = hypergeometricDistributionImpl3.probability(0.09999999999999998d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setSampleSize(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 97);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) ' ', (int) '4', 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((double) 10L);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(26);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        double double14 = hypergeometricDistributionImpl3.probability((double) 0);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double9 = hypergeometricDistributionImpl3.probability(0.0d);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability(98);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.probability((double) ' ');
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        java.lang.Class<?> wildcardClass25 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(89, 52, 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(52, 32, 8);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0, 97);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(52, 96, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 0);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 96);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 89);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        double double15 = hypergeometricDistributionImpl3.probability((double) 98);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double14 = hypergeometricDistributionImpl3.probability(95);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize(9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(98, (int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize(1);
        java.lang.Class<?> wildcardClass8 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int6 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((double) 9);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        hypergeometricDistributionImpl3.setPopulationSize(99);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 0, 97);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 105 + "'", int15 == 105);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        // The following exception was thrown during execution in test generation
        try {
            double double27 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability(33);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(35, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.probability((-1));
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double11 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(93);
        double double17 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        double double11 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) (-1));
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 94, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95, (double) 95);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L, (double) 98);
        hypergeometricDistributionImpl3.setSampleSize(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 93);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 89);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 89, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(25, (int) '#', 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        // The following exception was thrown during execution in test generation
        try {
            double double27 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        double double25 = hypergeometricDistributionImpl3.probability(26);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        hypergeometricDistributionImpl3.setSampleSize(105);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(95);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) ' ');
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        double double14 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '#', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.probability(0.0d);
        double double15 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.probability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setSampleSize(33);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', 0, 33);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.probability(97);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability(97);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(33);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.probability((double) 32);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(99, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', 35);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(93, 94);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(0.9699999999999995d, (double) (short) 10);
        double double29 = hypergeometricDistributionImpl3.probability((double) 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(10, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), (double) 98);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, (int) (byte) 100, (int) (byte) 10);
        double double5 = hypergeometricDistributionImpl3.probability((double) 26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, 9, 95);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize(105);
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 105 + "'", int21 == 105);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 32, (double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.probability(8);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        double double9 = hypergeometricDistributionImpl3.probability((double) 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1, 100);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double19 = hypergeometricDistributionImpl3.probability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(105, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 1.0f);
        double double21 = hypergeometricDistributionImpl3.probability(98);
        double double23 = hypergeometricDistributionImpl3.probability(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        double double17 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((int) '#');
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.probability(1);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.probability(1.0d);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        hypergeometricDistributionImpl3.setPopulationSize(25);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, (int) (short) 0, 0);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        double double17 = hypergeometricDistributionImpl3.probability((double) 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(52, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double7 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double9 = hypergeometricDistributionImpl3.probability((double) (-1L));
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(33, (int) (byte) 100);
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 128, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double9 = hypergeometricDistributionImpl3.probability((double) 32);
        hypergeometricDistributionImpl3.setPopulationSize(93);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(35);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) -1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double17 = hypergeometricDistributionImpl3.probability((double) 100);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1L));
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.probability(0.0d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) (short) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1, 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double16 = hypergeometricDistributionImpl3.probability(100.0d);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) (byte) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) (byte) 10);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f), (double) (byte) 10);
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(8, 94);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double16 = hypergeometricDistributionImpl3.probability(97);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double11 = hypergeometricDistributionImpl3.probability((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double16 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09999999999999998d + "'", double7 == 0.09999999999999998d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double19 = hypergeometricDistributionImpl3.probability((double) 95);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', 1, (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double19 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        double double21 = hypergeometricDistributionImpl3.probability(0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 128, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (short) 1, (int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(25);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 25);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.02999999999999997d);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 95 + "'", int9 == 95);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 93, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, 105);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(33);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.02999999999999997d + "'", double14 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(96);
        double double17 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) ' ', 93, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double11 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double19 = hypergeometricDistributionImpl3.probability((double) 93);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(105, (int) (byte) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 95);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setSampleSize(52);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability(33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double18 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 95 + "'", int16 == 95);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        double double17 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double21 = hypergeometricDistributionImpl3.probability((double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8969072164948454d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability(105, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(25, 128, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 89);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        java.lang.Class<?> wildcardClass21 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, 97);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 1.0f);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability(97);
        hypergeometricDistributionImpl3.setPopulationSize(128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 93);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 9, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double20 = hypergeometricDistributionImpl3.probability((double) 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(105, 35, (int) (short) 0);
        hypergeometricDistributionImpl3.setPopulationSize(128);
        double double7 = hypergeometricDistributionImpl3.probability((double) 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(99);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double20 = hypergeometricDistributionImpl3.probability((double) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95, (double) 95);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L, (double) 98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability(0.10309278350515466d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8969072164948454d);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 105);
        double double27 = hypergeometricDistributionImpl3.probability(99);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 128 + "'", int22 == 128);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }
}

