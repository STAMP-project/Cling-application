import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'x');
        double double18 = hypergeometricDistributionImpl3.probability(139);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        double double22 = hypergeometricDistributionImpl3.probability(0.37499999999999967d);
        double double24 = hypergeometricDistributionImpl3.probability(0.9985019032672348d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.5974816974151881d, (double) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((int) 'u');
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.7265306122448298d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        int int31 = hypergeometricDistributionImpl3.getPopulationSize();
        int int32 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        double double36 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double38 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(17);
        double double42 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.probability((double) 116);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(8);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(23);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setSampleSize(19);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(1.1678616760044506E-5d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8999999999999996d + "'", double15 == 0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2863535666489938d + "'", double20 == 0.2863535666489938d);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) 19);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'x');
        double double30 = hypergeometricDistributionImpl3.probability(1.5766795856128875E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double8 = hypergeometricDistributionImpl3.probability((double) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability(17);
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0804525749218429E-4d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((int) '4');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, 10.0d);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(120);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, 0.0d);
        double double32 = hypergeometricDistributionImpl3.cumulativeProbability(2);
        double double35 = hypergeometricDistributionImpl3.cumulativeProbability(0.019643348964018103d, (double) (short) 10);
        int int36 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(3);
        double double22 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(19);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test9014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9014");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream3.write((int) 'u');
        java.io.PrintStream printStream8 = new java.io.PrintStream("English");
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        boolean boolean11 = locale10.hasExtensions();
        java.util.Locale locale12 = java.util.Locale.ROOT;
        java.lang.String str13 = locale10.getDisplayName(locale12);
        java.util.Locale.setDefault(locale10);
        java.lang.String str15 = locale9.getDisplayName(locale10);
        java.lang.String str16 = locale9.getVariant();
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale17.toLanguageTag();
        java.lang.String str21 = locale9.getDisplayScript(locale17);
        java.lang.String str22 = locale9.toLanguageTag();
        java.lang.String str23 = locale9.getDisplayVariant();
        java.util.Set<java.lang.String> strSet24 = locale9.getUnicodeLocaleKeys();
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray27);
        java.lang.Throwable[] throwableArray29 = mathException28.getSuppressed();
        java.io.PrintStream printStream30 = printStream8.printf(locale9, "China", (java.lang.Object[]) throwableArray29);
        java.io.PrintStream printStream31 = printStream3.printf("KOREAN", (java.lang.Object[]) throwableArray29);
        java.io.PrintStream printStream33 = printStream31.append((java.lang.CharSequence) "japanese (JAPANESE)");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl37 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double39 = hypergeometricDistributionImpl37.probability((double) (byte) 10);
        double double41 = hypergeometricDistributionImpl37.upperCumulativeProbability(0);
        double double43 = hypergeometricDistributionImpl37.probability((int) (short) -1);
        double double45 = hypergeometricDistributionImpl37.probability((double) 1L);
        printStream33.println((java.lang.Object) hypergeometricDistributionImpl37);
        hypergeometricDistributionImpl37.setNumberOfSuccesses(20);
        int int49 = hypergeometricDistributionImpl37.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ja" + "'", str20, "ja");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "und" + "'", str22, "und");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(printStream30);
        org.junit.Assert.assertNotNull(printStream31);
        org.junit.Assert.assertNotNull(printStream33);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
    }

    @Test
    public void test9015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9015");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) 19);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double26 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 0);
        int int28 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.5766795856128875E-14d);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability(1.5766795856128875E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test9016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9016");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) 19);
        int int25 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int28 = hypergeometricDistributionImpl3.getPopulationSize();
        int int30 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        double double32 = hypergeometricDistributionImpl3.probability(164);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'x', 116);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test9017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9017");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        hypergeometricDistributionImpl3.setSampleSize(7);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test9018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9018");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 52);
        double double15 = hypergeometricDistributionImpl3.probability((double) 1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) (byte) 100);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(21);
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(0.9999823878699265d);
        int int25 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test9019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9019");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        printStream1.close();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Italy");
        printStream1.print((java.lang.Object) "Italy");
        printStream1.println((int) (byte) 0);
        printStream1.print("");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl13 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double15 = hypergeometricDistributionImpl13.probability((double) (byte) 10);
        double double17 = hypergeometricDistributionImpl13.upperCumulativeProbability(0);
        int int18 = hypergeometricDistributionImpl13.getSampleSize();
        int int19 = hypergeometricDistributionImpl13.getNumberOfSuccesses();
        int int20 = hypergeometricDistributionImpl13.getPopulationSize();
        printStream1.println((java.lang.Object) int20);
        printStream1.print(false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test9020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9020");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 10);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double25 = hypergeometricDistributionImpl3.probability((double) (short) 0);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double29 = hypergeometricDistributionImpl3.probability((double) 77);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test9021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9021");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) 'u', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9022");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.96875d);
        double double22 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(83);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test9023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9023");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) ' ');
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', 0.09191423021171147d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test9024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9024");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray6, (java.lang.Throwable) mathException9);
        java.io.PrintStream printStream11 = printStream1.printf(locale2, "Italy", objArray6);
        printStream1.println('a');
        java.util.Locale locale16 = new java.util.Locale("hi!", "Italy");
        printStream1.print((java.lang.Object) locale16);
        java.io.PrintStream printStream21 = printStream1.append((java.lang.CharSequence) "org.apache.commons.math.MathException: fr", (int) (short) 1, 10);
        printStream21.print((double) 100);
        printStream21.print((double) 10.0f);
        printStream21.print((double) 0.0f);
        printStream21.println(true);
        printStream21.close();
        printStream21.print(0.016796486795320274d);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl36 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double38 = hypergeometricDistributionImpl36.probability((double) (byte) 10);
        double double40 = hypergeometricDistributionImpl36.upperCumulativeProbability(0);
        double double42 = hypergeometricDistributionImpl36.probability((int) (short) -1);
        double double44 = hypergeometricDistributionImpl36.cumulativeProbability(10.0d);
        double double46 = hypergeometricDistributionImpl36.cumulativeProbability((double) 100L);
        printStream21.print((java.lang.Object) hypergeometricDistributionImpl36);
        double double49 = hypergeometricDistributionImpl36.probability(0.0d);
        double double51 = hypergeometricDistributionImpl36.probability(0);
        double double53 = hypergeometricDistributionImpl36.cumulativeProbability((int) ' ');
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!_ITALY");
        org.junit.Assert.assertNotNull(printStream21);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
    }

    @Test
    public void test9025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9025");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(4);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test9026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9026");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) 19);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        hypergeometricDistributionImpl3.setSampleSize(32);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        double double34 = hypergeometricDistributionImpl3.probability((double) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        int int38 = hypergeometricDistributionImpl3.inverseCumulativeProbability(4.661717760741692E-4d);
        double double40 = hypergeometricDistributionImpl3.cumulativeProbability((double) 51);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test9027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9027");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        double double19 = hypergeometricDistributionImpl3.probability(0.9832035132046797d);
        double double21 = hypergeometricDistributionImpl3.probability(0.997494986243276d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test9028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9028");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.5974816974151881d);
        double double17 = hypergeometricDistributionImpl3.probability(0.9899999999999994d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test9029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9029");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 10);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10L);
        double double23 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'x');
        double double27 = hypergeometricDistributionImpl3.probability((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = hypergeometricDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test9030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9030");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(19, (int) (short) 10, 1);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), 0.31999999999999984d);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double10 = hypergeometricDistributionImpl3.probability(35);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.473684210526316d + "'", double6 == 0.473684210526316d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test9031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9031");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double19 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double23 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0.855117335670845d, 0.007747414710432601d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test9032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9032");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(19, (int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, 0.0220780873473961d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test9033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9033");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) ' ');
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) 116);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(12);
        double double20 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test9034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9034");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) ' ');
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        hypergeometricDistributionImpl3.setPopulationSize(8);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 0.007747414710432601d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test9035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9035");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(17);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(4);
        double double26 = hypergeometricDistributionImpl3.probability((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test9036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9036");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability((double) 'x');
        double double12 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, 19);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#', (double) 100L);
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        double double24 = hypergeometricDistributionImpl3.probability(0.7220917884425503d);
        hypergeometricDistributionImpl3.setPopulationSize(116);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test9037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9037");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) ' ');
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'u');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 3, 100.0d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.06407194478887518d, (double) 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test9038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9038");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) 1);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.27777907587036726d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test9039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9039");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(0.31999999999999984d, (double) 100L);
        hypergeometricDistributionImpl3.setSampleSize(12);
        int int30 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test9040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9040");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        double double17 = hypergeometricDistributionImpl3.probability((int) ' ');
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test9041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9041");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 120);
        double double21 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test9042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9042");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.probability(0.9832035132046797d);
        double double21 = hypergeometricDistributionImpl3.probability(0.0d);
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test9043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9043");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int25 = hypergeometricDistributionImpl3.getPopulationSize();
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        int int27 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(116);
        int int30 = hypergeometricDistributionImpl3.getSampleSize();
        double double32 = hypergeometricDistributionImpl3.probability(16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test9044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9044");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray6, (java.lang.Throwable) mathException9);
        java.io.PrintStream printStream11 = printStream1.printf(locale2, "Italy", objArray6);
        printStream1.println('a');
        java.util.Locale locale16 = new java.util.Locale("hi!", "Italy");
        printStream1.print((java.lang.Object) locale16);
        java.io.PrintStream printStream21 = printStream1.append((java.lang.CharSequence) "org.apache.commons.math.MathException: fr", (int) (short) 1, 10);
        printStream21.print((double) 100);
        printStream21.print((double) 10.0f);
        printStream21.print((double) 0.0f);
        printStream21.println(true);
        printStream21.close();
        printStream21.print(0.016796486795320274d);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl36 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double38 = hypergeometricDistributionImpl36.probability((double) (byte) 10);
        double double40 = hypergeometricDistributionImpl36.upperCumulativeProbability(0);
        double double42 = hypergeometricDistributionImpl36.probability((int) (short) -1);
        double double44 = hypergeometricDistributionImpl36.cumulativeProbability(10.0d);
        double double46 = hypergeometricDistributionImpl36.cumulativeProbability((double) 100L);
        printStream21.print((java.lang.Object) hypergeometricDistributionImpl36);
        printStream21.println((-1.0d));
        java.util.Locale locale50 = java.util.Locale.ROOT;
        boolean boolean51 = locale50.hasExtensions();
        java.lang.String str52 = locale50.getCountry();
        java.util.Set<java.lang.String> strSet53 = locale50.getUnicodeLocaleKeys();
        printStream21.print((java.lang.Object) locale50);
        printStream21.println(false);
        printStream21.print('u');
        java.io.PrintStream printStream60 = printStream21.append('4');
        printStream21.println(false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!_ITALY");
        org.junit.Assert.assertNotNull(printStream21);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(printStream60);
    }

    @Test
    public void test9045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9045");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(19);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(52, (int) '4');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test9046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9046");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (byte) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(15);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(20);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test9047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9047");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double21 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(12);
        int int27 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int28 = hypergeometricDistributionImpl3.getSampleSize();
        double double30 = hypergeometricDistributionImpl3.probability((double) 17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test9048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9048");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0.9899999999999994d, (double) 120);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1.2220828891187718E-25d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test9049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9049");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(17, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test9050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9050");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability((double) 'x');
        double double12 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double16 = hypergeometricDistributionImpl3.probability((double) 0);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(116);
        hypergeometricDistributionImpl3.setSampleSize((int) 'u');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0.9832035132046886d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test9051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9051");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) (short) 100);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'x', 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test9052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9052");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        hypergeometricDistributionImpl3.setSampleSize(15);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test9053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9053");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray6, (java.lang.Throwable) mathException9);
        java.io.PrintStream printStream11 = printStream1.printf(locale2, "Italy", objArray6);
        printStream1.println('a');
        java.util.Locale locale16 = new java.util.Locale("hi!", "Italy");
        printStream1.print((java.lang.Object) locale16);
        java.io.PrintStream printStream21 = printStream1.append((java.lang.CharSequence) "org.apache.commons.math.MathException: fr", (int) (short) 1, 10);
        printStream21.println("hi!");
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter((java.io.OutputStream) printStream21);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("und", (java.lang.Throwable) mathException29);
        java.lang.Object[] objArray31 = mathException30.getArguments();
        java.io.PrintStream printStream32 = printStream21.printf("Italy", objArray31);
        java.io.PrintStream printStream35 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.OutputStream) printStream35);
        printStream35.println("org.apache.commons.math.MathException: fr");
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter((java.io.OutputStream) printStream35);
        boolean boolean40 = printWriter39.checkError();
        java.lang.Throwable throwable42 = null;
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException(throwable42);
        java.lang.Throwable[] throwableArray44 = mathException43.getSuppressed();
        java.io.PrintWriter printWriter45 = printWriter39.printf("Chinese", (java.lang.Object[]) throwableArray44);
        java.io.PrintStream printStream46 = printStream21.format("French", (java.lang.Object[]) throwableArray44);
        boolean boolean47 = printStream46.checkError();
        printStream46.println(true);
        printStream46.println("japanese (JAPANESE)");
        java.io.PrintStream printStream53 = printStream46.append((java.lang.CharSequence) "\u30d5\u30e9\u30f3\u30b9 (EN,KOREAN)");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl57 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double59 = hypergeometricDistributionImpl57.probability((int) ' ');
        hypergeometricDistributionImpl57.setNumberOfSuccesses(32);
        int int62 = hypergeometricDistributionImpl57.getNumberOfSuccesses();
        int int63 = hypergeometricDistributionImpl57.getNumberOfSuccesses();
        printStream46.println((java.lang.Object) hypergeometricDistributionImpl57);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!_ITALY");
        org.junit.Assert.assertNotNull(printStream21);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(printStream32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(printWriter45);
        org.junit.Assert.assertNotNull(printStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(printStream53);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 32 + "'", int63 == 32);
    }

    @Test
    public void test9054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9054");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) ' ');
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(3);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(139);
        hypergeometricDistributionImpl3.setSampleSize(119);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L, 4.661717760741692E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test9055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9055");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10L);
        double double17 = hypergeometricDistributionImpl3.probability((double) ' ');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.6799999999999998d);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(48, (int) 'x');
        int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        hypergeometricDistributionImpl3.setSampleSize(8);
        double double29 = hypergeometricDistributionImpl3.upperCumulativeProbability(15);
        double double32 = hypergeometricDistributionImpl3.cumulativeProbability(47, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test9056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9056");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((double) 10L);
        double double10 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), 0.999871863624849d);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'u');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test9057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9057");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(32);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(52);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(0.9998860892322688d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test9058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9058");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double22 = hypergeometricDistributionImpl3.probability((double) 0);
        int int23 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(0.855117335670845d);
        double double31 = hypergeometricDistributionImpl3.probability(117);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test9059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9059");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.probability(0.016796486795320274d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(117);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test9060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9060");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((double) 1);
        double double15 = hypergeometricDistributionImpl3.probability(32);
        double double17 = hypergeometricDistributionImpl3.probability(19);
        double double19 = hypergeometricDistributionImpl3.probability((int) ' ');
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test9061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9061");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(19);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        double double24 = hypergeometricDistributionImpl3.probability(32);
        double double26 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int27 = hypergeometricDistributionImpl3.getPopulationSize();
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(9.139076490693943E-4d);
        int int30 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test9062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9062");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.probability((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.probability(0.6799999999999998d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 8, (double) 8);
        double double20 = hypergeometricDistributionImpl3.probability(0.329896907216495d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test9063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9063");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 19);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(164);
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability(9);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        int int27 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setSampleSize(7);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
    }

    @Test
    public void test9064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9064");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(52);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(16);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(164);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test9065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9065");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        double double19 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'x');
        hypergeometricDistributionImpl3.setSampleSize(19);
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double31 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test9066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9066");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double21 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        int int25 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = hypergeometricDistributionImpl3.cumulativeProbability(9.139076490693943E-4d, 0.09191423021171147d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test9067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9067");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.5974816974151881d, (double) 'x');
        int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test9068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9068");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.probability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(116);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'x');
        hypergeometricDistributionImpl3.setSampleSize(35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 116 + "'", int18 == 116);
    }

    @Test
    public void test9069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9069");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double16 = hypergeometricDistributionImpl3.probability((double) (-1));
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test9070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9070");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int31 = hypergeometricDistributionImpl3.getSampleSize();
        double double33 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        int int34 = hypergeometricDistributionImpl3.getPopulationSize();
        int int36 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.6434301869243783d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test9071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9071");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 9);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability(2.5325738802402047E-4d, 0.9887572340733949d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test9072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9072");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'x', 10, (int) '4');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10L);
        double double8 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, 9);
        hypergeometricDistributionImpl3.setPopulationSize(7);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 9);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9998637005904101d + "'", double11 == 0.9998637005904101d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test9073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9073");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'x', (int) ' ', 52);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) 19);
        double double7 = hypergeometricDistributionImpl3.probability(15);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 139);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9904309899181619d + "'", double5 == 0.9904309899181619d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14697295392002496d + "'", double7 == 0.14697295392002496d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999998151445d + "'", double11 == 0.9999999998151445d);
    }

    @Test
    public void test9074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9074");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(19);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.probability(3.7268103154630694E-6d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(139, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test9075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9075");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("KR", (double) (byte) 0);
        java.lang.String str3 = languageRange2.getRange();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl7 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double9 = hypergeometricDistributionImpl7.probability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl7.upperCumulativeProbability(0);
        int int12 = hypergeometricDistributionImpl7.getSampleSize();
        double double15 = hypergeometricDistributionImpl7.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double17 = hypergeometricDistributionImpl7.upperCumulativeProbability((int) 'u');
        double double19 = hypergeometricDistributionImpl7.probability((double) 100);
        hypergeometricDistributionImpl7.setSampleSize((int) (short) 1);
        double double23 = hypergeometricDistributionImpl7.probability((double) (-1.0f));
        double double25 = hypergeometricDistributionImpl7.probability((double) '4');
        double double28 = hypergeometricDistributionImpl7.cumulativeProbability((double) (-1), (double) 19);
        int int29 = hypergeometricDistributionImpl7.getPopulationSize();
        int int30 = hypergeometricDistributionImpl7.getSampleSize();
        hypergeometricDistributionImpl7.setPopulationSize((int) 'u');
        int int33 = hypergeometricDistributionImpl7.getPopulationSize();
        hypergeometricDistributionImpl7.setSampleSize(8);
        int int36 = hypergeometricDistributionImpl7.getNumberOfSuccesses();
        double double38 = hypergeometricDistributionImpl7.cumulativeProbability((int) ' ');
        double double40 = hypergeometricDistributionImpl7.probability((double) 119);
        boolean boolean41 = languageRange2.equals((java.lang.Object) double40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kr" + "'", str3, "kr");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 117 + "'", int33 == 117);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test9076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9076");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) 10.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(19);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test9077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9077");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setSampleSize(139);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test9078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9078");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.probability((double) (short) -1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test9079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9079");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.io.PrintStream printStream2 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl6 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int7 = hypergeometricDistributionImpl6.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl6.cumulativeProbability((int) (byte) 0);
        hypergeometricDistributionImpl6.setPopulationSize(117);
        int int13 = hypergeometricDistributionImpl6.inverseCumulativeProbability(0.016796486795320274d);
        hypergeometricDistributionImpl6.setSampleSize(16);
        double double17 = hypergeometricDistributionImpl6.cumulativeProbability((double) 'x');
        printStream2.print((java.lang.Object) hypergeometricDistributionImpl6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream22 = printStream2.append((java.lang.CharSequence) "France", 51, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 117");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test9080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9080");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) 19);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'x');
        int int30 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.99998832138324d);
        hypergeometricDistributionImpl3.setSampleSize(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
    }

    @Test
    public void test9081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9081");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double20 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        int int24 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.6500000000000139d);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(215, 215);
        int int28 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(117);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 68 + "'", int24 == 68);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test9082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9082");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        double double16 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test9083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9083");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 0);
        double double10 = hypergeometricDistributionImpl3.probability(100.0d);
        double double12 = hypergeometricDistributionImpl3.probability((double) 10L);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        double double16 = hypergeometricDistributionImpl3.probability(1.2813637502083475E-4d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test9084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9084");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) (byte) 1);
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test9085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9085");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double21 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        double double26 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setSampleSize(32);
        int int29 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
    }

    @Test
    public void test9086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9086");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test9087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9087");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.probability(0);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a', (int) (short) 100);
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test9088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9088");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) ' ');
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) 100);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        hypergeometricDistributionImpl3.setSampleSize(0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize(16);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 100);
        int int25 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test9089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9089");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream3, true);
        char[] charArray8 = new char[] { '#', ' ' };
        printStream3.print(charArray8);
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter("hi!");
        char[] charArray16 = new char[] { 'a', ' ', '#', 'u' };
        printWriter11.print(charArray16);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter("hi!");
        char[] charArray24 = new char[] { 'a', ' ', '#', 'u' };
        printWriter19.print(charArray24);
        printWriter11.println(charArray24);
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("hi!");
        printWriter28.println("fr");
        printWriter28.println('4');
        java.io.PrintWriter printWriter34 = printWriter28.append('4');
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter("hi!");
        char[] charArray39 = new char[] { ' ', ' ' };
        printWriter36.write(charArray39);
        printWriter34.print(charArray39);
        printWriter11.write(charArray39);
        printStream3.print(charArray39);
        printStream3.print('u');
        java.io.PrintStream printStream46 = new java.io.PrintStream((java.io.OutputStream) printStream3);
        java.io.PrintStream printStream47 = new java.io.PrintStream((java.io.OutputStream) printStream3);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl51 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double53 = hypergeometricDistributionImpl51.probability((double) (byte) 10);
        double double55 = hypergeometricDistributionImpl51.upperCumulativeProbability(0);
        int int56 = hypergeometricDistributionImpl51.getPopulationSize();
        double double58 = hypergeometricDistributionImpl51.probability((double) 'x');
        printStream3.print((java.lang.Object) double58);
        printStream3.print(1.0d);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a #u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a #u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a,  , #, u]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "a #u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "a #u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a,  , #, u]");
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test9090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9090");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray6, (java.lang.Throwable) mathException9);
        java.io.PrintStream printStream11 = printStream1.printf(locale2, "Italy", objArray6);
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter("hi!");
        printWriter13.println("fr");
        printWriter13.println('4');
        printWriter13.write((int) (byte) 10);
        printWriter13.close();
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray22);
        printWriter13.print((java.lang.Object) mathException23);
        printStream1.println((java.lang.Object) printWriter13);
        printStream1.println((double) 1L);
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream30 = new java.io.PrintStream((java.io.OutputStream) printStream28, false);
        printStream28.print((float) 120);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl36 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (byte) 10, (int) (byte) 0);
        hypergeometricDistributionImpl36.setNumberOfSuccesses(1);
        double double41 = hypergeometricDistributionImpl36.cumulativeProbability(0.0d, (double) 0L);
        double double43 = hypergeometricDistributionImpl36.probability((double) 100L);
        double double45 = hypergeometricDistributionImpl36.cumulativeProbability(28);
        int int46 = hypergeometricDistributionImpl36.getNumberOfSuccesses();
        printStream28.print((java.lang.Object) int46);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream50 = new java.io.PrintStream((java.io.OutputStream) printStream28, false, "hi!_italy");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!_italy");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test9091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9091");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double7 = hypergeometricDistributionImpl3.probability((int) 'x');
        hypergeometricDistributionImpl3.setSampleSize(120);
        hypergeometricDistributionImpl3.setPopulationSize(3);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(28);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability(2.5325738802402047E-4d, 0.6153846153846155d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test9092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9092");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((double) 1);
        double double15 = hypergeometricDistributionImpl3.probability(32);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (double) 'u');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'u');
        double double26 = hypergeometricDistributionImpl3.probability((double) 0L);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(21);
        double double33 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        int int34 = hypergeometricDistributionImpl3.getSampleSize();
        int int35 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
    }

    @Test
    public void test9093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, (int) (short) 1, 67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9094");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) 'a');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(4.5765229880284356E-23d, (double) 23);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test9095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9095");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test9096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9096");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double23 = hypergeometricDistributionImpl3.probability(8);
        hypergeometricDistributionImpl3.setSampleSize((int) 'u');
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        int int27 = hypergeometricDistributionImpl3.getSampleSize();
        int int28 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double31 = hypergeometricDistributionImpl3.cumulativeProbability((double) 11, 0.016796486795320274d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 117 + "'", int27 == 117);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test9097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9097");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.10789607619367111d);
        double double19 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test9098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9098");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'x');
        hypergeometricDistributionImpl3.setPopulationSize(17);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(4.903150665642348E-6d, (double) 22);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
    }

    @Test
    public void test9099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9099");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.9998860892322688d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test9100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9100");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("italy");
        printWriter1.println((long) 19);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl7 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double9 = hypergeometricDistributionImpl7.cumulativeProbability((double) 100);
        int int10 = hypergeometricDistributionImpl7.getSampleSize();
        int int11 = hypergeometricDistributionImpl7.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl7.getPopulationSize();
        hypergeometricDistributionImpl7.setSampleSize(0);
        double double16 = hypergeometricDistributionImpl7.cumulativeProbability((int) (byte) 0);
        double double19 = hypergeometricDistributionImpl7.cumulativeProbability((int) (byte) 0, 8);
        printWriter1.print((java.lang.Object) hypergeometricDistributionImpl7);
        printWriter1.close();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl25 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double27 = hypergeometricDistributionImpl25.probability((double) (byte) 10);
        double double29 = hypergeometricDistributionImpl25.upperCumulativeProbability(0);
        int int30 = hypergeometricDistributionImpl25.getSampleSize();
        double double33 = hypergeometricDistributionImpl25.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double35 = hypergeometricDistributionImpl25.upperCumulativeProbability((int) 'u');
        double double37 = hypergeometricDistributionImpl25.probability((double) 100);
        hypergeometricDistributionImpl25.setSampleSize((int) (short) 1);
        double double41 = hypergeometricDistributionImpl25.probability((double) (-1.0f));
        int int42 = hypergeometricDistributionImpl25.getNumberOfSuccesses();
        double double44 = hypergeometricDistributionImpl25.cumulativeProbability((int) (short) 1);
        int int45 = hypergeometricDistributionImpl25.getPopulationSize();
        double double48 = hypergeometricDistributionImpl25.cumulativeProbability(0.0d, 0.6799999999999998d);
        int int49 = hypergeometricDistributionImpl25.getSampleSize();
        int int50 = hypergeometricDistributionImpl25.getNumberOfSuccesses();
        hypergeometricDistributionImpl25.setNumberOfSuccesses(100);
        double double55 = hypergeometricDistributionImpl25.cumulativeProbability((double) 0, (double) (short) 100);
        int int56 = hypergeometricDistributionImpl25.getPopulationSize();
        double double58 = hypergeometricDistributionImpl25.cumulativeProbability(68);
        printWriter1.println((java.lang.Object) hypergeometricDistributionImpl25);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6799999999999998d + "'", double48 == 0.6799999999999998d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
    }

    @Test
    public void test9101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9101");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        double double14 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(3);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(3);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        int int25 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test9102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9102");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.5974816974151881d);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.probability(27);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'x');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test9103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9103");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(19);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        int int28 = hypergeometricDistributionImpl3.inverseCumulativeProbability(6.319025527691419E-14d);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability(2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test9104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9104");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.probability((double) 47);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test9105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9105");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability((double) 'x');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 22);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        int int23 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test9106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9107");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, (int) (short) 1, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, 0.473684210526316d);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, 21);
        double double13 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test9108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9108");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability(117);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test9109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9109");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) ' ');
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) 100);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double15 = hypergeometricDistributionImpl3.probability(1);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.probability(139);
        double double20 = hypergeometricDistributionImpl3.probability((double) 52);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int26 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.473684210526316d);
        int int27 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 30 + "'", int26 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test9110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9110");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        int int31 = hypergeometricDistributionImpl3.getPopulationSize();
        int int32 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        double double36 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double38 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double41 = hypergeometricDistributionImpl3.cumulativeProbability(1.696883264656647E-4d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test9111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9111");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((double) 1);
        double double15 = hypergeometricDistributionImpl3.probability(32);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (double) 'u');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int28 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.997749601625586d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test9112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9112");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((int) '4');
        double double15 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        hypergeometricDistributionImpl3.setPopulationSize(28);
        double double21 = hypergeometricDistributionImpl3.probability(30);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 28 + "'", int22 == 28);
    }

    @Test
    public void test9113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9113");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(3);
        double double13 = hypergeometricDistributionImpl3.probability(0.9904309899181619d);
        double double15 = hypergeometricDistributionImpl3.probability((double) 35);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test9114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9114");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 32);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(0, 15);
        double double31 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double33 = hypergeometricDistributionImpl3.cumulativeProbability(13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6799999999999998d + "'", double22 == 0.6799999999999998d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6799999999999998d + "'", double26 == 0.6799999999999998d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
    }

    @Test
    public void test9115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9115");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'x');
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(3.2252132151043996E-5d, (double) 31);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test9116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9116");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) 1);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.31999999999999984d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability(0.039723216793903546d, 0.38461538461538447d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test9117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9117");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double23 = hypergeometricDistributionImpl3.probability((int) '#');
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        int int26 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(83);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test9118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9118");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) (short) 1);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) ' ');
        int int28 = hypergeometricDistributionImpl3.getSampleSize();
        int int29 = hypergeometricDistributionImpl3.getSampleSize();
        double double31 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        int int33 = hypergeometricDistributionImpl3.inverseCumulativeProbability(3.394176516652897E-23d);
        double double35 = hypergeometricDistributionImpl3.probability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3200000000000002d + "'", double24 == 0.3200000000000002d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.6799999999999998d + "'", double31 == 0.6799999999999998d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test9119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9119");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double16 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        double double22 = hypergeometricDistributionImpl3.probability((int) 'x');
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(32, 32);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        int int28 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 98 + "'", int28 == 98);
    }

    @Test
    public void test9120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9120");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.9887572340733949d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test9121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9121");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'u');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test9122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9122");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test9123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9123");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double28 = hypergeometricDistributionImpl3.probability((double) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        int int31 = hypergeometricDistributionImpl3.getPopulationSize();
        double double33 = hypergeometricDistributionImpl3.probability(2.6670700710191974E-9d);
        double double35 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3200000000000002d + "'", double24 == 0.3200000000000002d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
    }

    @Test
    public void test9124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9124");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, (int) (short) 1, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(8, 8);
        double double10 = hypergeometricDistributionImpl3.probability(0.09191423021171147d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test9125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9125");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.println((long) 'u');
        printWriter1.println();
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        printWriter6.print(100);
        printWriter6.close();
        java.io.PrintWriter printWriter11 = printWriter6.append((java.lang.CharSequence) "org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl15 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double17 = hypergeometricDistributionImpl15.probability((double) (byte) 10);
        double double19 = hypergeometricDistributionImpl15.upperCumulativeProbability(0);
        int int20 = hypergeometricDistributionImpl15.getSampleSize();
        double double23 = hypergeometricDistributionImpl15.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double25 = hypergeometricDistributionImpl15.upperCumulativeProbability((int) 'u');
        double double27 = hypergeometricDistributionImpl15.probability((double) 100);
        hypergeometricDistributionImpl15.setSampleSize((int) (short) 1);
        double double31 = hypergeometricDistributionImpl15.probability((double) (-1.0f));
        double double33 = hypergeometricDistributionImpl15.probability((double) '4');
        double double36 = hypergeometricDistributionImpl15.cumulativeProbability((double) (-1), (double) 19);
        int int37 = hypergeometricDistributionImpl15.getSampleSize();
        double double39 = hypergeometricDistributionImpl15.upperCumulativeProbability((-1));
        printWriter6.println((java.lang.Object) hypergeometricDistributionImpl15);
        hypergeometricDistributionImpl15.setPopulationSize(1);
        int int44 = hypergeometricDistributionImpl15.inverseCumulativeProbability((double) (short) 1);
        org.junit.Assert.assertNotNull(printWriter11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
    }

    @Test
    public void test9126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9126");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double19 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double21 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.004028787708041d + "'", double25 == 0.004028787708041d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test9127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9127");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) (short) 1);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) ' ');
        int int28 = hypergeometricDistributionImpl3.getPopulationSize();
        int int29 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double31 = hypergeometricDistributionImpl3.cumulativeProbability(0.0014980967327740578d);
        int int32 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3200000000000002d + "'", double24 == 0.3200000000000002d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.6799999999999998d + "'", double31 == 0.6799999999999998d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test9128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9128");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.probability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 10.0f);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(47);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test9129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9129");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int25 = hypergeometricDistributionImpl3.getPopulationSize();
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) 3);
        hypergeometricDistributionImpl3.setSampleSize(9);
        double double33 = hypergeometricDistributionImpl3.upperCumulativeProbability(17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.3200000000000002d + "'", double29 == 0.3200000000000002d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test9130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9130");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setSampleSize(120);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.473684210526316d);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(19);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        double double26 = hypergeometricDistributionImpl3.upperCumulativeProbability(11);
        int int27 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test9131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9131");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test9132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9132");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, 10.0d);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(120);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, 0.0d);
        double double32 = hypergeometricDistributionImpl3.cumulativeProbability(2);
        double double34 = hypergeometricDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test9133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9133");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0726917082026395d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test9134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9134");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) 'x');
        double double32 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setPopulationSize(139);
        int int35 = hypergeometricDistributionImpl3.getPopulationSize();
        int int36 = hypergeometricDistributionImpl3.getPopulationSize();
        int int37 = hypergeometricDistributionImpl3.getSampleSize();
        double double39 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 139 + "'", int35 == 139);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 139 + "'", int36 == 139);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 120 + "'", int37 == 120);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
    }

    @Test
    public void test9135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9135");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability((double) 'x');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 22);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(0.10851293051961812d, 0.0220780873473961d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test9136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9136");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) 32);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        double double25 = hypergeometricDistributionImpl3.probability(116);
        double double27 = hypergeometricDistributionImpl3.upperCumulativeProbability(3);
        double double29 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double31 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(52);
        double double35 = hypergeometricDistributionImpl3.cumulativeProbability(67);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
    }

    @Test
    public void test9137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9137");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double18 = hypergeometricDistributionImpl3.probability(0.7142857142857143d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test9138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9138");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.println("fr");
        printWriter1.println((double) 100);
        printWriter1.println();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale7.getDisplayName(locale9);
        java.util.Locale.setDefault(locale7);
        boolean boolean12 = locale7.hasExtensions();
        printWriter1.println((java.lang.Object) boolean12);
        printWriter1.print((int) (short) -1);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl19 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int20 = hypergeometricDistributionImpl19.getNumberOfSuccesses();
        int int22 = hypergeometricDistributionImpl19.inverseCumulativeProbability((double) (short) 0);
        int int23 = hypergeometricDistributionImpl19.getSampleSize();
        hypergeometricDistributionImpl19.setNumberOfSuccesses((int) (short) 10);
        double double27 = hypergeometricDistributionImpl19.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl19.setSampleSize((int) (short) 0);
        int int30 = hypergeometricDistributionImpl19.getSampleSize();
        double double32 = hypergeometricDistributionImpl19.cumulativeProbability((double) 0);
        double double34 = hypergeometricDistributionImpl19.probability((double) (byte) -1);
        double double37 = hypergeometricDistributionImpl19.cumulativeProbability((double) (short) 0, (double) 1L);
        double double39 = hypergeometricDistributionImpl19.cumulativeProbability(0.0d);
        printWriter1.println((java.lang.Object) hypergeometricDistributionImpl19);
        int int41 = hypergeometricDistributionImpl19.getNumberOfSuccesses();
        hypergeometricDistributionImpl19.setPopulationSize(8);
        hypergeometricDistributionImpl19.setNumberOfSuccesses(16);
        hypergeometricDistributionImpl19.setPopulationSize(137);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test9139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9139");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.9832035132046797d);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(21);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test9140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9140");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(52);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test9141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9141");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 10);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 10L);
        double double23 = hypergeometricDistributionImpl3.probability((double) 3);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(100, (int) (byte) 100);
        int int28 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.9944420835455412d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test9142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9142");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test9143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9143");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(117);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test9144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9144");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double25 = hypergeometricDistributionImpl3.probability(8.810042947678966E-13d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test9145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9145");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int29 = hypergeometricDistributionImpl3.getSampleSize();
        double double31 = hypergeometricDistributionImpl3.probability((double) 100L);
        double double33 = hypergeometricDistributionImpl3.probability(0.7333333333333337d);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'u');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test9146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9146");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double21 = hypergeometricDistributionImpl3.probability(1.0d);
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        double double24 = hypergeometricDistributionImpl3.probability((double) 137);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test9147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9147");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((double) 1);
        double double15 = hypergeometricDistributionImpl3.probability(32);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (double) 'u');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f, (double) 139);
        double double28 = hypergeometricDistributionImpl3.probability((int) '#');
        double double31 = hypergeometricDistributionImpl3.cumulativeProbability(52, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test9148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9148");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        int int6 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1.2220828891187718E-25d, 1.2220828891187718E-25d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test9149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9149");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, (int) (short) 1, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int7 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test9150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 139, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9151");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10L);
        double double17 = hypergeometricDistributionImpl3.probability((double) 52);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d, (double) 'a');
        double double22 = hypergeometricDistributionImpl3.probability((double) 137);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test9152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9152");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.10789607619367111d);
        hypergeometricDistributionImpl3.setSampleSize(24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test9153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9153");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        double double25 = hypergeometricDistributionImpl3.probability((double) (short) 10);
        double double27 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double29 = hypergeometricDistributionImpl3.probability(0);
        int int30 = hypergeometricDistributionImpl3.getPopulationSize();
        int int31 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6799999999999998d + "'", double23 == 0.6799999999999998d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.6799999999999998d + "'", double29 == 0.6799999999999998d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test9154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9154");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(117);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test9155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9155");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray6, (java.lang.Throwable) mathException9);
        java.io.PrintStream printStream11 = printStream1.printf(locale2, "Italy", objArray6);
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter("hi!");
        printWriter13.println("fr");
        printWriter13.println('4');
        printWriter13.write((int) (byte) 10);
        printWriter13.close();
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray22);
        printWriter13.print((java.lang.Object) mathException23);
        printStream1.println((java.lang.Object) printWriter13);
        printStream1.println((double) 1L);
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream30 = new java.io.PrintStream((java.io.OutputStream) printStream28, false);
        printStream28.print((float) 120);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl36 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (byte) 10, (int) (byte) 0);
        hypergeometricDistributionImpl36.setNumberOfSuccesses(1);
        double double41 = hypergeometricDistributionImpl36.cumulativeProbability(0.0d, (double) 0L);
        double double43 = hypergeometricDistributionImpl36.probability((double) 100L);
        double double45 = hypergeometricDistributionImpl36.cumulativeProbability(28);
        int int46 = hypergeometricDistributionImpl36.getNumberOfSuccesses();
        printStream28.print((java.lang.Object) int46);
        printStream28.println((float) 'u');
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test9156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9156");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(117, (int) (byte) 0, 117);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(117);
        int int6 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.8485541736774688E-10d);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(16, 95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test9157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9157");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, 0.6799999999999998d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'u');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(120);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setSampleSize(8);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test9158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9158");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) ' ');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(19);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test9159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9159");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(17);
        int int24 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int27 = hypergeometricDistributionImpl3.getSampleSize();
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test9160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9160");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double23 = hypergeometricDistributionImpl3.probability(8);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        int int26 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double28 = hypergeometricDistributionImpl3.probability(3);
        double double30 = hypergeometricDistributionImpl3.probability(3);
        double double32 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double35 = hypergeometricDistributionImpl3.cumulativeProbability(95, 95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test9161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9161");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10L);
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(9, 35);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability(1.576679585612854E-14d, (double) 30);
        double double32 = hypergeometricDistributionImpl3.cumulativeProbability(2.524055018235335E-8d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9999823878699265d + "'", double27 == 0.9999823878699265d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.9999999638146903d + "'", double30 == 0.9999999638146903d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.761793774329941E-16d + "'", double32 == 1.761793774329941E-16d);
    }

    @Test
    public void test9162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9162");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) 32);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.31999999999999984d);
        double double17 = hypergeometricDistributionImpl3.probability(1.2813637502083475E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(6.992395703633908E-27d, 0.005038011914197545d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test9163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9163");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((double) 1);
        double double15 = hypergeometricDistributionImpl3.probability(32);
        double double17 = hypergeometricDistributionImpl3.probability(19);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.probability(18);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test9164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9164");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((double) 10L);
        double double10 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), 0.999871863624849d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0.016796486795320274d, (double) 28);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test9165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9165");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(19);
        double double23 = hypergeometricDistributionImpl3.probability(0.9832035132046797d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize(35);
        int int28 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test9166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9166");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.println("fr");
        printWriter1.println('4');
        printWriter1.write((int) (byte) 10);
        printWriter1.print('a');
        printWriter1.println(10.0d);
        java.io.PrintWriter printWriter13 = printWriter1.append((java.lang.CharSequence) "org.apache.commons.math.MathException: ");
        printWriter13.print(32);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter("hi!");
        char[] charArray22 = new char[] { ' ', ' ' };
        printWriter19.write(charArray22);
        printWriter19.println((java.lang.Object) 1.0f);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        boolean boolean27 = locale26.hasExtensions();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.lang.String str29 = locale26.getDisplayName(locale28);
        java.util.Locale.setDefault(locale26);
        java.lang.String str31 = locale26.getISO3Language();
        printWriter19.println((java.lang.Object) locale26);
        java.util.Locale locale33 = null;
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray37);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("fr", objArray37, (java.lang.Throwable) mathException40);
        java.io.PrintWriter printWriter42 = printWriter19.printf(locale33, "Japanese", objArray37);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("Korean", objArray37);
        java.lang.Object[] objArray44 = mathException43.getArguments();
        java.lang.Throwable[] throwableArray45 = mathException43.getSuppressed();
        java.io.PrintWriter printWriter46 = printWriter13.format("Chinook jargon", (java.lang.Object[]) throwableArray45);
        printWriter13.close();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl51 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double53 = hypergeometricDistributionImpl51.probability((double) (byte) 10);
        double double55 = hypergeometricDistributionImpl51.upperCumulativeProbability(0);
        double double57 = hypergeometricDistributionImpl51.probability((int) (short) -1);
        double double59 = hypergeometricDistributionImpl51.cumulativeProbability(10.0d);
        double double61 = hypergeometricDistributionImpl51.cumulativeProbability((double) 52);
        double double63 = hypergeometricDistributionImpl51.probability((double) 1);
        printWriter13.print((java.lang.Object) hypergeometricDistributionImpl51);
        double double67 = hypergeometricDistributionImpl51.cumulativeProbability((double) 17, (double) 19);
        double double70 = hypergeometricDistributionImpl51.cumulativeProbability(0, 32);
        double double72 = hypergeometricDistributionImpl51.cumulativeProbability((double) '4');
        int int73 = hypergeometricDistributionImpl51.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double76 = hypergeometricDistributionImpl51.cumulativeProbability(0.37499999999999967d, 0.02999999999999997d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter13);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ,  ]");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test9167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9167");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, 1.0d);
        double double16 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(67);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(3.394176516652897E-23d, 2.2172131994946764E-6d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test9168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9168");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.probability(11);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(20);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.9999869783990183d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test9169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9169");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(7, (-1), 77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9170");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.007747414710432601d);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test9171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9171");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test9172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9172");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', (int) '#');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test9173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9173");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability(3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test9174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9174");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(215);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test9175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9175");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) (short) 100);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(139);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test9176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9176");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) (short) 1);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double32 = hypergeometricDistributionImpl3.cumulativeProbability(0, 64);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = hypergeometricDistributionImpl3.cumulativeProbability((double) 19, (double) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3200000000000002d + "'", double24 == 0.3200000000000002d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test9177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9177");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'x');
        hypergeometricDistributionImpl3.setPopulationSize(32);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        double double23 = hypergeometricDistributionImpl3.probability((double) 137);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test9178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9178");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) 19);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double25 = hypergeometricDistributionImpl3.probability(48);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test9179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9179");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        double double19 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        double double27 = hypergeometricDistributionImpl3.probability(32);
        int int28 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test9180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9180");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(10);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(8);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test9181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9181");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setPopulationSize(119);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        double double21 = hypergeometricDistributionImpl3.probability((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 119 + "'", int19 == 119);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test9182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9182");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int31 = hypergeometricDistributionImpl3.getSampleSize();
        double double33 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        int int34 = hypergeometricDistributionImpl3.getSampleSize();
        int int35 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double37 = hypergeometricDistributionImpl3.probability(0.9999999999999201d);
        double double39 = hypergeometricDistributionImpl3.cumulativeProbability(120);
        hypergeometricDistributionImpl3.setSampleSize(32);
        int int42 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test9183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9183");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHN");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl9 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double11 = hypergeometricDistributionImpl9.probability((double) (byte) 10);
        double double13 = hypergeometricDistributionImpl9.upperCumulativeProbability(0);
        double double15 = hypergeometricDistributionImpl9.probability((int) (short) -1);
        double double17 = hypergeometricDistributionImpl9.probability((double) 1L);
        hypergeometricDistributionImpl9.setNumberOfSuccesses((int) (short) 100);
        double double21 = hypergeometricDistributionImpl9.probability(10);
        double double24 = hypergeometricDistributionImpl9.cumulativeProbability((double) (byte) 100, (double) (byte) 100);
        double double27 = hypergeometricDistributionImpl9.cumulativeProbability(1.7716462366090333E-7d, (double) 10L);
        boolean boolean28 = languageRange1.equals((java.lang.Object) double27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chn" + "'", str3, "chn");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chn" + "'", str4, "chn");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test9184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9184");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double30 = hypergeometricDistributionImpl3.upperCumulativeProbability(22);
        hypergeometricDistributionImpl3.setPopulationSize(32);
        double double34 = hypergeometricDistributionImpl3.cumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3200000000000002d + "'", double24 == 0.3200000000000002d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test9185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9185");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int31 = hypergeometricDistributionImpl3.getSampleSize();
        double double33 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        int int34 = hypergeometricDistributionImpl3.getSampleSize();
        int int35 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double37 = hypergeometricDistributionImpl3.probability(0.9999999999999201d);
        double double39 = hypergeometricDistributionImpl3.upperCumulativeProbability(11);
        double double41 = hypergeometricDistributionImpl3.cumulativeProbability(0.06015367196305699d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
    }

    @Test
    public void test9186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9186");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', (int) '#');
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test9187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9187");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 215);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test9188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9188");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setPopulationSize(32);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(9);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test9189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9189");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double7 = hypergeometricDistributionImpl3.probability((int) 'x');
        hypergeometricDistributionImpl3.setSampleSize(120);
        hypergeometricDistributionImpl3.setPopulationSize(3);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(28);
        hypergeometricDistributionImpl3.setSampleSize(21);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
    }

    @Test
    public void test9190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9190");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L));
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(2.0218138963024046E-7d, 1.792083073492013E-6d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test9191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9191");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(22, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9192");
        java.util.Locale locale3 = new java.util.Locale("org.apache.commons.math.MathException: can", "org.apache.commons.math.MathException: German", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: anglais");
        java.lang.String str4 = locale3.getDisplayScript();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl8 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double10 = hypergeometricDistributionImpl8.probability((int) ' ');
        double double13 = hypergeometricDistributionImpl8.cumulativeProbability((double) (short) 0, (double) (short) 100);
        int int14 = hypergeometricDistributionImpl8.getPopulationSize();
        double double16 = hypergeometricDistributionImpl8.probability(19);
        int int18 = hypergeometricDistributionImpl8.inverseCumulativeProbability(0.004028787708041d);
        double double20 = hypergeometricDistributionImpl8.cumulativeProbability(9);
        boolean boolean21 = locale3.equals((java.lang.Object) double20);
        org.junit.Assert.assertEquals(locale3.toString(), "org.apache.commons.math.mathexception: can_ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: GERMAN_org.apache.commons.math.MathException: org.apache.commons.math.MathException: anglais");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test9193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9193");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) ' ');
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        double double18 = hypergeometricDistributionImpl3.probability((-1.0d));
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double22 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        double double24 = hypergeometricDistributionImpl3.probability(100);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(0, 27);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(137);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test9194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9194");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0L);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) (-1.0f));
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), (double) 17);
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double23 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double25 = hypergeometricDistributionImpl3.probability((-1));
        int int27 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.6884319432243721d);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = hypergeometricDistributionImpl3.cumulativeProbability(16, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test9195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9195");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        double double17 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double19 = hypergeometricDistributionImpl3.probability((double) 100L);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        double double22 = hypergeometricDistributionImpl3.probability(0.016796486795320274d);
        double double24 = hypergeometricDistributionImpl3.probability(3);
        int int26 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.3200000000000002d);
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(4.661717760741692E-4d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test9196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9196");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(3.726810324352626E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test9197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9197");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        printStream1.close();
        printStream1.print((double) 1);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Collection<java.util.Locale> localeCollection8 = null;
        java.util.Locale locale9 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection8);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale locale15 = java.util.Locale.ROOT;
        boolean boolean16 = locale15.hasExtensions();
        java.lang.String str17 = locale15.getCountry();
        java.util.Locale locale18 = java.util.Locale.JAPAN;
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale18, locale19, locale23 };
        java.util.ArrayList<java.util.Locale> localeList25 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList25, localeArray24);
        java.util.List<java.util.Locale> localeList27 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap30);
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.lang.String str33 = locale32.toLanguageTag();
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.lang.String str35 = locale32.getDisplayName(locale34);
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str37 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strSet36);
        printStream1.println((java.lang.Object) strSet36);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl42 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double44 = hypergeometricDistributionImpl42.probability((double) (byte) 10);
        double double46 = hypergeometricDistributionImpl42.upperCumulativeProbability(0);
        int int47 = hypergeometricDistributionImpl42.getSampleSize();
        int int48 = hypergeometricDistributionImpl42.getNumberOfSuccesses();
        double double51 = hypergeometricDistributionImpl42.cumulativeProbability((-1), (int) (byte) 0);
        printStream1.print((java.lang.Object) hypergeometricDistributionImpl42);
        double double54 = hypergeometricDistributionImpl42.cumulativeProbability(10);
        double double56 = hypergeometricDistributionImpl42.cumulativeProbability(0);
        double double58 = hypergeometricDistributionImpl42.cumulativeProbability((double) 15);
        int int59 = hypergeometricDistributionImpl42.getPopulationSize();
        double double61 = hypergeometricDistributionImpl42.probability(48);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(localeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localeList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "und" + "'", str33, "und");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test9198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9198");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double16 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setSampleSize(52);
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.3200000000000002d);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(3);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability(0.10851293051963276d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.1283233857840329d + "'", double22 == 0.1283233857840329d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test9199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9199");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray6, (java.lang.Throwable) mathException9);
        java.io.PrintStream printStream11 = printStream1.printf(locale2, "Italy", objArray6);
        printStream1.println('a');
        java.util.Locale locale16 = new java.util.Locale("hi!", "Italy");
        printStream1.print((java.lang.Object) locale16);
        java.io.PrintStream printStream21 = printStream1.append((java.lang.CharSequence) "org.apache.commons.math.MathException: fr", (int) (short) 1, 10);
        printStream21.print((double) 100);
        printStream21.print((double) 10.0f);
        printStream21.print((double) 0.0f);
        printStream21.println(true);
        printStream21.close();
        printStream21.print(0.016796486795320274d);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl36 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double38 = hypergeometricDistributionImpl36.probability((double) (byte) 10);
        double double40 = hypergeometricDistributionImpl36.upperCumulativeProbability(0);
        double double42 = hypergeometricDistributionImpl36.probability((int) (short) -1);
        double double44 = hypergeometricDistributionImpl36.cumulativeProbability(10.0d);
        double double46 = hypergeometricDistributionImpl36.cumulativeProbability((double) 100L);
        printStream21.print((java.lang.Object) hypergeometricDistributionImpl36);
        double double49 = hypergeometricDistributionImpl36.probability(0.0d);
        double double51 = hypergeometricDistributionImpl36.probability(0);
        double double53 = hypergeometricDistributionImpl36.cumulativeProbability(120);
        double double56 = hypergeometricDistributionImpl36.cumulativeProbability(0.09109958939835083d, (double) 20);
        double double58 = hypergeometricDistributionImpl36.probability((int) (short) -1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!_ITALY");
        org.junit.Assert.assertNotNull(printStream21);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test9200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9200");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9201");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test9202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9202");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'x', 10, (int) '4');
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test9203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9203");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'x');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.00657968163944688d);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test9204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9204");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) (short) 100);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability(19);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test9205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9205");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(10);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 52);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0.299145299145299d, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test9206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9206");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { 'a', ' ', '#', 'u' };
        printWriter3.print(charArray8);
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter("hi!");
        char[] charArray16 = new char[] { 'a', ' ', '#', 'u' };
        printWriter11.print(charArray16);
        printWriter3.println(charArray16);
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter("hi!");
        printWriter20.println("fr");
        printWriter20.println('4');
        java.io.PrintWriter printWriter26 = printWriter20.append('4');
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("hi!");
        char[] charArray31 = new char[] { ' ', ' ' };
        printWriter28.write(charArray31);
        printWriter26.print(charArray31);
        printWriter3.write(charArray31);
        printStream1.println(charArray31);
        java.io.PrintStream printStream37 = printStream1.append('#');
        printStream37.println((java.lang.Object) 'u');
        java.util.Locale locale40 = java.util.Locale.ROOT;
        boolean boolean41 = locale40.hasExtensions();
        java.util.Locale locale42 = java.util.Locale.ROOT;
        java.lang.String str43 = locale40.getDisplayName(locale42);
        java.lang.String str44 = locale40.getISO3Country();
        java.util.Locale.setDefault(locale40);
        java.lang.String str46 = locale40.getDisplayCountry();
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale40.getDisplayCountry(locale47);
        java.lang.String[] strArray50 = java.util.Locale.getISOLanguages();
        java.io.PrintStream printStream51 = printStream37.printf(locale40, "CA", (java.lang.Object[]) strArray50);
        printStream51.println(0.0d);
        printStream51.println((long) 'u');
        java.lang.Object obj56 = null;
        printStream51.println(obj56);
        java.io.PrintStream printStream59 = printStream51.append((java.lang.CharSequence) "");
        printStream51.println((long) 1);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter((java.io.OutputStream) printStream51, false);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl67 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double69 = hypergeometricDistributionImpl67.probability((int) ' ');
        hypergeometricDistributionImpl67.setNumberOfSuccesses(32);
        printStream51.println((java.lang.Object) hypergeometricDistributionImpl67);
        int int73 = hypergeometricDistributionImpl67.getSampleSize();
        int int74 = hypergeometricDistributionImpl67.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a #u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a #u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , #, u]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a #u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a #u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a,  , #, u]");
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ ,  ]");
        org.junit.Assert.assertNotNull(printStream37);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(printStream51);
        org.junit.Assert.assertNotNull(printStream59);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 32 + "'", int74 == 32);
    }

    @Test
    public void test9207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9207");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double8 = hypergeometricDistributionImpl3.probability((int) 'x');
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, (double) 1.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.probability(22);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test9208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9208");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(19);
        double double23 = hypergeometricDistributionImpl3.probability(0.9832035132046797d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize(35);
        double double29 = hypergeometricDistributionImpl3.cumulativeProbability(26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test9209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9209");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability((double) 'x');
        double double12 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, 19);
        hypergeometricDistributionImpl3.setPopulationSize(32);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double24 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test9210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9210");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 10L);
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        double double21 = hypergeometricDistributionImpl3.probability((double) (short) 0);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(17);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(17);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability((double) 8, (double) 215);
        hypergeometricDistributionImpl3.setSampleSize(16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test9211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9211");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(23);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test9212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9212");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        printStream1.close();
        java.io.PrintStream printStream4 = printStream1.append('4');
        printStream4.write((int) '#');
        printStream4.println(true);
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter((java.io.OutputStream) printStream4, false);
        java.io.PrintStream printStream12 = new java.io.PrintStream((java.io.OutputStream) printStream4, false);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl16 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double18 = hypergeometricDistributionImpl16.probability((double) (byte) 10);
        double double20 = hypergeometricDistributionImpl16.upperCumulativeProbability(0);
        int int21 = hypergeometricDistributionImpl16.getSampleSize();
        double double24 = hypergeometricDistributionImpl16.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double26 = hypergeometricDistributionImpl16.upperCumulativeProbability((int) 'u');
        double double28 = hypergeometricDistributionImpl16.probability((double) 10);
        int int29 = hypergeometricDistributionImpl16.getPopulationSize();
        hypergeometricDistributionImpl16.setPopulationSize(10);
        printStream4.println((java.lang.Object) hypergeometricDistributionImpl16);
        double double34 = hypergeometricDistributionImpl16.probability((double) 100L);
        hypergeometricDistributionImpl16.setNumberOfSuccesses(116);
        hypergeometricDistributionImpl16.setNumberOfSuccesses(67);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test9213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9213");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double30 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int31 = hypergeometricDistributionImpl3.getSampleSize();
        double double33 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        int int34 = hypergeometricDistributionImpl3.getPopulationSize();
        double double36 = hypergeometricDistributionImpl3.probability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test9214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9214");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        double double23 = hypergeometricDistributionImpl3.probability((double) ' ');
        hypergeometricDistributionImpl3.setSampleSize(6);
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        double double28 = hypergeometricDistributionImpl3.probability((double) 11);
        int int29 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test9215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9215");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double12 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 8, (double) 'u');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        hypergeometricDistributionImpl3.setPopulationSize(20);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability(16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test9216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9216");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double16 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(32);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        double double22 = hypergeometricDistributionImpl3.probability((int) 'x');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test9217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9217");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        double double21 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        double double26 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(137);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test9218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9218");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        printStream1.close();
        java.io.PrintStream printStream4 = printStream1.append('4');
        printStream4.write((int) '#');
        printStream4.println(true);
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter((java.io.OutputStream) printStream4, false);
        printStream4.println("en");
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printWriter13.print((int) 'a');
        printWriter13.println((float) 'u');
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl21 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double23 = hypergeometricDistributionImpl21.probability((double) (byte) 10);
        double double25 = hypergeometricDistributionImpl21.upperCumulativeProbability(0);
        int int26 = hypergeometricDistributionImpl21.getSampleSize();
        double double29 = hypergeometricDistributionImpl21.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double31 = hypergeometricDistributionImpl21.upperCumulativeProbability((int) 'u');
        double double33 = hypergeometricDistributionImpl21.probability((double) 10L);
        hypergeometricDistributionImpl21.setSampleSize(10);
        double double38 = hypergeometricDistributionImpl21.cumulativeProbability((double) 0L, (double) (byte) 1);
        double double40 = hypergeometricDistributionImpl21.probability((double) 100);
        int int41 = hypergeometricDistributionImpl21.getSampleSize();
        int int43 = hypergeometricDistributionImpl21.inverseCumulativeProbability(0.0220780873473961d);
        printWriter13.println((java.lang.Object) int43);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.10789607619367111d + "'", double38 == 0.10789607619367111d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test9219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9219");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test9220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9220");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double18 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        double double20 = hypergeometricDistributionImpl3.probability(77);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(119, 77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test9221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9221");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) 'a');
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(17);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(139);
        int int27 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test9222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9222");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double19 = hypergeometricDistributionImpl3.probability((double) (-1.0f));
        double double21 = hypergeometricDistributionImpl3.probability((double) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) (short) 1);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) ' ');
        int int28 = hypergeometricDistributionImpl3.getPopulationSize();
        double double30 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        int int31 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3200000000000002d + "'", double24 == 0.3200000000000002d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test9223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9223");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(19);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(23);
        int int25 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test9224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9224");
        java.io.PrintStream printStream1 = new java.io.PrintStream("KOR");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl5 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(117, (int) (byte) 0, 117);
        double double8 = hypergeometricDistributionImpl5.cumulativeProbability((double) (-1), 0.6153846153846155d);
        printStream1.println((java.lang.Object) double8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test9225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9225");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) (byte) 0);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 10.0d);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double30 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double32 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double34 = hypergeometricDistributionImpl3.cumulativeProbability(0.10789607619367111d);
        double double36 = hypergeometricDistributionImpl3.probability(116);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test9226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9226");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (byte) 10, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(0.31999999999999984d);
        double double7 = hypergeometricDistributionImpl3.probability(0.5974816974151881d);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.probability((double) 107);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test9227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9227");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double8 = hypergeometricDistributionImpl3.probability((double) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double18 = hypergeometricDistributionImpl3.probability(28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test9228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9228");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.6500000000000139d, (double) 1.0f);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize(3);
        double double25 = hypergeometricDistributionImpl3.probability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test9229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9229");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'u');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(19);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(4);
        double double28 = hypergeometricDistributionImpl3.probability(0.38461538461538447d);
        int int30 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.9832035132046886d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test9230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9230");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(2, 23, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9231");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) ' ', 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) 1L);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 12);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(1.2813637502083475E-4d);
        double double24 = hypergeometricDistributionImpl3.probability(64);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }
}
