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
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) 52);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(9, 93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double17 = hypergeometricDistributionImpl3.probability(0.02999999999999997d);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double15 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, 0, 6);
        java.lang.Class<?> wildcardClass4 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double17 = hypergeometricDistributionImpl3.probability(0.02999999999999997d);
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        java.lang.Class<?> wildcardClass23 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 94 + "'", int20 == 94);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.probability((double) ' ');
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.probability(35);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) (short) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        double double16 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(93, (int) (short) 0, 8);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        double double28 = hypergeometricDistributionImpl3.probability((-1));
        hypergeometricDistributionImpl3.setSampleSize(8);
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(105);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double13 = hypergeometricDistributionImpl3.probability(6);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '#', 93, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double12 = hypergeometricDistributionImpl3.probability(35);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 0);
        double double17 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(95);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 95 + "'", int11 == 95);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 9);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, (int) (byte) 100, (int) (byte) 10);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double20 = hypergeometricDistributionImpl3.probability((double) 95);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        java.lang.Class<?> wildcardClass8 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        double double21 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((double) 9);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100.0f);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 95);
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        double double17 = hypergeometricDistributionImpl3.probability(0.0d);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 94, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 0, (int) (byte) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 52, (int) (short) 10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.probability(0.0d);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(94, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize(6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', 0.9699999999999995d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4', (double) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, (int) '4');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 105);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d, 0.8999999999999996d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.probability(97);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(32, 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) -1, 0, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(26, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(105);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.02999999999999997d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 95 + "'", int9 == 95);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 10L);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(95);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 95 + "'", int15 == 95);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '#', (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize(32);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 0, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', 35);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '4');
        hypergeometricDistributionImpl3.setSampleSize(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int25 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(95);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability(0.09999999999999998d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.10309278350515466d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(105);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.probability(0.0d);
        double double15 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(35);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) ' ');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 95);
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 128, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(52, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8999999999999996d + "'", double6 == 0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double16 = hypergeometricDistributionImpl3.probability((double) 96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double17 = hypergeometricDistributionImpl3.probability(0.0d);
        double double19 = hypergeometricDistributionImpl3.probability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        double double18 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(97, 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double19 = hypergeometricDistributionImpl3.probability(0.10309278350515466d);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d, (double) 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double17 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (-1), 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
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
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        // The following exception was thrown during execution in test generation
        try {
            double double30 = hypergeometricDistributionImpl3.cumulativeProbability(89, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize(6);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) -1, 32, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(33, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(89, 96);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        double double15 = hypergeometricDistributionImpl3.probability(95);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.lang.Class<?> wildcardClass23 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.probability((double) 35);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 26, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        double double22 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        double double21 = hypergeometricDistributionImpl3.probability((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 89, (double) (-1L));
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(128, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 10, 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double10 = hypergeometricDistributionImpl3.probability((double) 98);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 98);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96, (double) 97);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        double double21 = hypergeometricDistributionImpl3.probability((double) 98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.10309278350515466d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(26, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(93);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double17 = hypergeometricDistributionImpl3.probability(0.02999999999999997d);
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.10309278350515466d);
        java.lang.Class<?> wildcardClass22 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96, (double) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(105);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        double double17 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.probability(0.0d);
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 93, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 10L);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(26, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double19 = hypergeometricDistributionImpl3.probability((double) 96);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, 105, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double20 = hypergeometricDistributionImpl3.probability((double) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.probability((double) 97);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) '4');
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        double double21 = hypergeometricDistributionImpl3.probability((double) 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 1, 95, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(6, 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d, (double) 95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability(100);
        double double15 = hypergeometricDistributionImpl3.probability(0.0d);
        double double17 = hypergeometricDistributionImpl3.probability((int) '#');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 105, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.09999999999999998d, (double) (short) 100);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.probability((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.probability(0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.9699999999999995d);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 93 + "'", int17 == 93);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(99, (-1));
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        double double26 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 99);
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double16 = hypergeometricDistributionImpl3.probability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) -1, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 89, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(93);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(98, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1, (double) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(105);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int25 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.probability(0.0d);
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double21 = hypergeometricDistributionImpl3.probability(93);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, 6, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize(26);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(96);
        double double20 = hypergeometricDistributionImpl3.probability((int) '#');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 0, 97);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability(100.0d);
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, (int) (short) 100, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) 10);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double21 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(100, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) '#', 26);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((-1), 100, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) (short) 100);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) (byte) 100, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize(105);
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 97);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.probability(10);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double25 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double27 = hypergeometricDistributionImpl3.probability((double) 98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double17 = hypergeometricDistributionImpl3.probability(1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double28 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        int int26 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.97d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double22 = hypergeometricDistributionImpl3.probability((double) 105);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability(94, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 93, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double11 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setSampleSize(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability(32);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) 95);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(96, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(35);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        double double15 = hypergeometricDistributionImpl3.probability((double) 98);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.09999999999999998d, (double) 98);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(6, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability(100.0d);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        double double21 = hypergeometricDistributionImpl3.probability((double) 100);
        double double23 = hypergeometricDistributionImpl3.probability(128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4', (double) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = hypergeometricDistributionImpl3.cumulativeProbability(105, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(6, 32, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability(105);
        java.lang.Class<?> wildcardClass7 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double19 = hypergeometricDistributionImpl3.probability((double) 95);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, 98);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double20 = hypergeometricDistributionImpl3.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, 0.8969072164948454d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        double double5 = hypergeometricDistributionImpl3.probability(0.0d);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, 0.8969072164948454d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8999999999999996d + "'", double5 == 0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1, (double) '#');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.probability((double) 100L);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(10, 26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L, (double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 10L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.probability((double) 98);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 'a');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(96, 98, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(52);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        double double24 = hypergeometricDistributionImpl3.upperCumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(52, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 52, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d, (double) 26);
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', 95, 0);
        int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(9, 89, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.probability(35);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.probability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.probability((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double15 = hypergeometricDistributionImpl3.probability(94);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double20 = hypergeometricDistributionImpl3.probability(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(0.09999999999999998d, (double) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability((double) (-1L));
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability(105);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1, (double) '#');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0, 8);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (-1L));
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.probability(0.0d);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95, (double) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.probability(10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double20 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(89, (int) (short) 100, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) 'a');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.probability(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        double double15 = hypergeometricDistributionImpl3.probability(95);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability(100.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
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
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.probability((double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, (int) (short) 10);
        double double18 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1);
        hypergeometricDistributionImpl3.setSampleSize(9);
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
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double12 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability(100.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 97);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 33, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(8);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d, (double) (short) 0);
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
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) -1, 33, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.probability(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.probability((double) (-1L));
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability(0.0d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(105);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 128, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability(100);
        double double15 = hypergeometricDistributionImpl3.probability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double24 = hypergeometricDistributionImpl3.probability((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 95);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        double double16 = hypergeometricDistributionImpl3.probability(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.probability(32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        hypergeometricDistributionImpl3.setSampleSize(105);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 32);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(10, (-1));
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 8, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        hypergeometricDistributionImpl3.setPopulationSize(105);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '#', 97, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.probability(10);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(96);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 8, (double) 94);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize(105);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double23 = hypergeometricDistributionImpl3.probability((double) 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double13 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        hypergeometricDistributionImpl3.setSampleSize(89);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double11 = hypergeometricDistributionImpl3.probability((double) '4');
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability(100);
        double double15 = hypergeometricDistributionImpl3.probability(0.0d);
        double double17 = hypergeometricDistributionImpl3.probability((int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability(89, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 9);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 0);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 10L);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, 98, 35);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = hypergeometricDistributionImpl3.cumulativeProbability(95, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02999999999999997d + "'", double7 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(95);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(35);
        hypergeometricDistributionImpl3.setSampleSize(35);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1);
        java.lang.Class<?> wildcardClass10 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 93, (int) '4');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 95 + "'", int4 == 95);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, (int) (short) 100, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) 'a', 1);
        double double5 = hypergeometricDistributionImpl3.probability(96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(89);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        double double24 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(26, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(35, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(105);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability(100, 52);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(35);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, 35, (int) (byte) 100);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.probability((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        hypergeometricDistributionImpl3.setPopulationSize(32);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 95 + "'", int17 == 95);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, 9, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.probability(0.0d);
        double double15 = hypergeometricDistributionImpl3.probability((int) '4');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        double double15 = hypergeometricDistributionImpl3.probability((double) 97);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, 89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) ' ', (int) (byte) 1, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(26);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(1, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 89, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(128, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 100L);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = hypergeometricDistributionImpl3.cumulativeProbability(98, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.probability(35);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double21 = hypergeometricDistributionImpl3.probability(8);
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 6);
        double double13 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        double double23 = hypergeometricDistributionImpl3.probability(1);
        double double25 = hypergeometricDistributionImpl3.upperCumulativeProbability(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '#');
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double14 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        double double16 = hypergeometricDistributionImpl3.probability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double11 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int25 = hypergeometricDistributionImpl3.getPopulationSize();
        int int26 = hypergeometricDistributionImpl3.getSampleSize();
        int int27 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, 98, (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.probability(1);
        java.lang.Class<?> wildcardClass8 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(1, 26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) (short) 10, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.probability(94);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(96);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.probability((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(98);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(25);
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability(26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 128);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
}

