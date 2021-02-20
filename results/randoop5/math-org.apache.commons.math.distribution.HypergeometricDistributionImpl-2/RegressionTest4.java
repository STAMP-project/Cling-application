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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', 0, 33);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(10, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        double double20 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, (int) (byte) 100, (int) (byte) 10);
        double double5 = hypergeometricDistributionImpl3.probability((double) 26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, 9, 95);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        double double9 = hypergeometricDistributionImpl3.probability((double) 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, (int) (short) 0, 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(52, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 128, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) 95);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', 1, (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (short) 1, (int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(25);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 25);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(98);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize(99);
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) ' ', 93, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 9, (double) (short) 10);
        double double12 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(94);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(25, 128, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 9, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(105, 35, (int) (short) 0);
        hypergeometricDistributionImpl3.setPopulationSize(128);
        double double7 = hypergeometricDistributionImpl3.probability((double) 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(33);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double14 = hypergeometricDistributionImpl3.probability(0.8999999999999996d);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 1, 98, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 105 + "'", int8 == 105);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.probability(0);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize(97);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, 0.8999999999999996d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double20 = hypergeometricDistributionImpl3.probability((double) 95);
        double double22 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double24 = hypergeometricDistributionImpl3.probability(10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0.10309278350515466d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#', 0.02999999999999997d);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        double double20 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 8, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability(97);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 1, 26);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double14 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double16 = hypergeometricDistributionImpl3.probability(100.0d);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) (byte) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) (byte) 10);
        int int23 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass24 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 95 + "'", int23 == 95);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double20 = hypergeometricDistributionImpl3.probability(95);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        double double25 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.probability((double) 26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.probability(105);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        hypergeometricDistributionImpl3.setPopulationSize(9);
        double double23 = hypergeometricDistributionImpl3.probability((double) 26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double16 = hypergeometricDistributionImpl3.probability(97);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double23 = hypergeometricDistributionImpl3.probability(0);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        double double19 = hypergeometricDistributionImpl3.probability((double) 105);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
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
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double15 = hypergeometricDistributionImpl3.probability((double) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability((double) 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 89 + "'", int13 == 89);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 97, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d, (double) 100);
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.97d + "'", double10 == 0.97d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double11 = hypergeometricDistributionImpl3.probability(0.9699999999999995d);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(33, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 93);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) 26);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f), (double) 93);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(9, 128, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(94, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double20 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(35);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 93, (double) 94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) 8);
        double double7 = hypergeometricDistributionImpl3.probability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((double) 9);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability(10.0d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(128);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 98);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize(8);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.probability((double) '4');
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(128);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(6, 1, 1);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setPopulationSize(96);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 97, (int) (byte) 10);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 10);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double20 = hypergeometricDistributionImpl3.probability((double) 95);
        double double22 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        int int23 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double13 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 0);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8969072164948454d + "'", double20 == 0.8969072164948454d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.8969072164948454d + "'", double22 == 0.8969072164948454d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double11 = hypergeometricDistributionImpl3.probability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability(0.10309278350515466d);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d, 0.97d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.10309278350515466d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) 35);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) 96);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
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
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, 0.9699999999999995d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double17 = hypergeometricDistributionImpl3.probability(1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(26);
        double double17 = hypergeometricDistributionImpl3.probability(0);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability(100.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', 95, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 33);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 95 + "'", int9 == 95);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, 98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(30);
        java.lang.Class<?> wildcardClass21 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 95 + "'", int16 == 95);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8969072164948454d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(26, 99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double10 = hypergeometricDistributionImpl3.probability(98);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.probability(0.8969072164948454d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4', (double) (short) -1);
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double12 = hypergeometricDistributionImpl3.probability(35);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        double double20 = hypergeometricDistributionImpl3.probability(32);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        java.lang.Class<?> wildcardClass22 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 97, (int) (byte) 10);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        double double27 = hypergeometricDistributionImpl3.probability(52);
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, 0.8969072164948454d);
        double double26 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        int int27 = hypergeometricDistributionImpl3.getPopulationSize();
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.probability((double) 98);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability(1);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        double double11 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.probability(35);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.09999999999999998d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0, 128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(35);
        hypergeometricDistributionImpl3.setPopulationSize(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        hypergeometricDistributionImpl3.setSampleSize(105);
        double double16 = hypergeometricDistributionImpl3.probability(95);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (double) 100);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(96);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(26);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(99);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 0, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(35, (int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double18 = hypergeometricDistributionImpl3.probability(0.8969072164948454d);
        double double20 = hypergeometricDistributionImpl3.probability(98);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 97, (int) (byte) 10);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, 100);
        hypergeometricDistributionImpl3.setPopulationSize(93);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double11 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, 97);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double13 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (-1));
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.probability((double) 52);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability(98, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8999999999999996d + "'", double6 == 0.8999999999999996d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.probability(0);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double11 = hypergeometricDistributionImpl3.probability(0);
        double double13 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double15 = hypergeometricDistributionImpl3.probability(94);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability(99);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.probability(0.0d);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(25, 96, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, 98);
        hypergeometricDistributionImpl3.setSampleSize(6);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.9699999999999995d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 35);
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 95 + "'", int23 == 95);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability(105);
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        double double15 = hypergeometricDistributionImpl3.probability(96);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(105);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        double double31 = hypergeometricDistributionImpl3.probability(33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(93, 98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double23 = hypergeometricDistributionImpl3.probability(0);
        int int24 = hypergeometricDistributionImpl3.getSampleSize();
        int int26 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(89, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        int int27 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.97d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(6, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(128, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, 105);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(30);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability(6);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.probability(25);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.probability(35);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.probability(0.0d);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(99);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 0, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(89, 96);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        double double20 = hypergeometricDistributionImpl3.probability((double) 1);
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
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        java.lang.Class<?> wildcardClass20 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize(97);
        double double14 = hypergeometricDistributionImpl3.probability(105);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(94, 99, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(52, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        hypergeometricDistributionImpl3.setPopulationSize(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '#', (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) (short) 100);
        double double18 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        hypergeometricDistributionImpl3.setPopulationSize(128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double11 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double13 = hypergeometricDistributionImpl3.probability((double) 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 0, 0);
        hypergeometricDistributionImpl3.setSampleSize(33);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double17 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double20 = hypergeometricDistributionImpl3.probability((double) 98);
        double double22 = hypergeometricDistributionImpl3.probability((double) 93);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 30, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        int int10 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        hypergeometricDistributionImpl3.setSampleSize(105);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 105 + "'", int13 == 105);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.probability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(89);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(93);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(35, 94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(95, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        double double17 = hypergeometricDistributionImpl3.probability((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 89, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double19 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double18 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(33);
        hypergeometricDistributionImpl3.setSampleSize(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) (short) 100);
        double double16 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        double double28 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize(1);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.probability((-1));
        double double15 = hypergeometricDistributionImpl3.probability(0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, 105, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 32, (double) 89);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(105);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(26);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.02999999999999997d);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 95);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(99, (int) (byte) -1);
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
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(128);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 10L);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double21 = hypergeometricDistributionImpl3.probability((double) 25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability(32);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double17 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 'a');
        int int23 = hypergeometricDistributionImpl3.getSampleSize();
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(33);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 100, (int) ' ');
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setSampleSize(6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double17 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double18 = hypergeometricDistributionImpl3.probability((double) 30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (byte) 0);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(10, 35);
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        int int25 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(94);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability(105);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 97);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double19 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 95 + "'", int13 == 95);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(89);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 96, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(30, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(30, 35);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 32, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double19 = hypergeometricDistributionImpl3.probability(30);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 1, 6);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(9);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 93);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.02999999999999997d);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(52, 97);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double18 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(33);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        double double24 = hypergeometricDistributionImpl3.probability((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        java.lang.Class<?> wildcardClass6 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98);
        double double15 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.probability(0.0d);
        double double19 = hypergeometricDistributionImpl3.probability(128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(9);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double17 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 95 + "'", int18 == 95);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(99);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        hypergeometricDistributionImpl3.setSampleSize(89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double10 = hypergeometricDistributionImpl3.probability((double) 98);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 105);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 9, (double) 105);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (short) 1, (int) (short) 1);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, (int) '4', 95);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.probability((double) (short) -1);
        double double17 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(105);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(94);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        double double13 = hypergeometricDistributionImpl3.probability(98);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, (int) (short) 0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(52);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setPopulationSize(30);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass25 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double24 = hypergeometricDistributionImpl3.probability(0.0d);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        double double14 = hypergeometricDistributionImpl3.probability((double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 95 + "'", int17 == 95);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 33, (int) ' ');
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.probability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double21 = hypergeometricDistributionImpl3.probability((double) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double15 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(93);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1, 100);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability(0.0d);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(105);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, 105);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.02999999999999997d + "'", double14 == 0.02999999999999997d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 35, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.probability(0.0d);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double20 = hypergeometricDistributionImpl3.probability(0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0, 8);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.probability(10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (double) 100);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(96);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        double double18 = hypergeometricDistributionImpl3.probability((double) 105);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(26);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        hypergeometricDistributionImpl3.setSampleSize(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.probability((double) 35);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double14 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8999999999999996d);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        int int23 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        double double15 = hypergeometricDistributionImpl3.probability(98);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.probability((double) ' ');
        hypergeometricDistributionImpl3.setSampleSize(98);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 35);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, (double) 10.0f);
        double double18 = hypergeometricDistributionImpl3.probability((double) 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) -1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, (int) '4', 95);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 52);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(89, 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 0, (int) (byte) 10);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8969072164948454d);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(6, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double13 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (-1));
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(1, 99);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(33);
        int int25 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }
}

