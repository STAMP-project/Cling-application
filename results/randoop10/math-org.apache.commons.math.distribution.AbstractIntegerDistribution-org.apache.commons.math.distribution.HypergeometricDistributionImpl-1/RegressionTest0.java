import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str2, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException3);
        java.lang.Class<?> wildcardClass7 = mathException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Class<?> wildcardClass4 = mathException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        java.lang.Class<?> wildcardClass5 = mathException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 0, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        java.lang.String str9 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str9, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Class<?> wildcardClass5 = mathException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) -1, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistributionImpl3.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1, throwableArray5, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.String str14 = mathException13.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str14, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        java.lang.Class<?> wildcardClass9 = mathException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException3);
        java.lang.String str7 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str7, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1, throwableArray5, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.String str14 = mathException13.getPattern();
        java.lang.String str15 = mathException13.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str15, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        java.lang.String str8 = mathException6.getPattern();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException9);
        java.lang.Class<?> wildcardClass11 = mathException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray8 = mathException7.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.String str13 = mathException11.getPattern();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException14);
        mathException4.addSuppressed((java.lang.Throwable) mathException14);
        java.lang.String str17 = mathException14.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str17, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 0, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 1, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 1);
        double double19 = hypergeometricDistributionImpl3.probability((int) '4');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        java.lang.Class<?> wildcardClass24 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray9 = mathException6.getSuppressed();
        java.lang.Class<?> wildcardClass10 = mathException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 52, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        java.lang.String str8 = mathException6.getPattern();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException12);
        mathException10.addSuppressed((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        java.lang.String str16 = mathException15.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str16, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4', (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability(97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.String str4 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str4, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        mathException6.addSuppressed((java.lang.Throwable) mathException11);
        java.lang.Object[] objArray13 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.String str15 = mathException6.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str15, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException3);
        java.lang.String str7 = mathException1.getPattern();
        java.lang.String str8 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.String str13 = mathException11.getPattern();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException11);
        mathException1.addSuppressed((java.lang.Throwable) mathException11);
        java.lang.String str16 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str16, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 52);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl5 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double8 = hypergeometricDistributionImpl5.cumulativeProbability(0, (int) (short) 0);
        double double10 = hypergeometricDistributionImpl5.probability((int) (byte) 0);
        double double12 = hypergeometricDistributionImpl5.probability(0.0d);
        int int13 = hypergeometricDistributionImpl5.getPopulationSize();
        double double15 = hypergeometricDistributionImpl5.upperCumulativeProbability(97);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl19 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int20 = hypergeometricDistributionImpl19.getNumberOfSuccesses();
        hypergeometricDistributionImpl19.setPopulationSize((int) (short) 100);
        double double25 = hypergeometricDistributionImpl19.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        int int26 = hypergeometricDistributionImpl19.getSampleSize();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl30 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int31 = hypergeometricDistributionImpl30.getNumberOfSuccesses();
        int int32 = hypergeometricDistributionImpl30.getNumberOfSuccesses();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl36 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double39 = hypergeometricDistributionImpl36.cumulativeProbability(0, (int) (short) 0);
        int int40 = hypergeometricDistributionImpl36.getNumberOfSuccesses();
        int int41 = hypergeometricDistributionImpl36.getNumberOfSuccesses();
        int int42 = hypergeometricDistributionImpl36.getSampleSize();
        int int43 = hypergeometricDistributionImpl36.getNumberOfSuccesses();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl47 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int48 = hypergeometricDistributionImpl47.getNumberOfSuccesses();
        hypergeometricDistributionImpl47.setPopulationSize((int) (short) 100);
        double double53 = hypergeometricDistributionImpl47.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        int int54 = hypergeometricDistributionImpl47.getSampleSize();
        java.lang.Object[] objArray56 = new java.lang.Object[] { double15, hypergeometricDistributionImpl19, int32, hypergeometricDistributionImpl36, hypergeometricDistributionImpl47, 0 };
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", objArray56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray56);
        java.lang.String str59 = mathException58.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str59, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        java.lang.String str5 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str5, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 52, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException15);
        mathException5.addSuppressed((java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray18 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray21 = mathException20.getSuppressed();
        java.lang.String str22 = mathException20.getPattern();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray31 = mathException30.getSuppressed();
        java.lang.String str32 = mathException30.getPattern();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException33);
        mathException23.addSuppressed((java.lang.Throwable) mathException33);
        java.lang.Throwable[] throwableArray36 = mathException23.getSuppressed();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) mathException23);
        java.lang.String str38 = mathException37.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.math.MathException: " + "'", str38, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray9 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.String str11 = mathException6.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str11, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str3, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        java.lang.Class<?> wildcardClass10 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray7 = mathException3.getSuppressed();
        java.lang.Class<?> wildcardClass8 = mathException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray6 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray6);
        java.lang.String str8 = mathException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str8, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = mathException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray8 = mathException7.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.String str13 = mathException11.getPattern();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException14);
        mathException4.addSuppressed((java.lang.Throwable) mathException14);
        java.lang.Throwable[] throwableArray17 = mathException4.getSuppressed();
        java.lang.String str18 = mathException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str18, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) -1, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        mathException6.addSuppressed((java.lang.Throwable) mathException11);
        java.lang.Object[] objArray13 = mathException6.getArguments();
        java.lang.String str14 = mathException6.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str14, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1, throwableArray4, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", objArray10);
        java.lang.String str12 = mathException11.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: " + "'", str12, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize(97);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) -1, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', 0.6391752577319588d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability(52);
        double double16 = hypergeometricDistributionImpl3.probability(1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        double double19 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray7 = mathException2.getSuppressed();
        java.lang.Throwable[] throwableArray8 = mathException2.getSuppressed();
        java.lang.String str9 = mathException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str9, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (short) 100);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) ' ');
        double double20 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(35);
        hypergeometricDistributionImpl3.setSampleSize(35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray8 = mathException7.getSuppressed();
        java.lang.String str9 = mathException7.getPattern();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException13);
        java.lang.Object[] objArray17 = mathException13.getArguments();
        java.lang.String str18 = mathException13.getPattern();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6391752577319588d + "'", double18 == 0.6391752577319588d);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray7 = mathException3.getSuppressed();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException3.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1, throwableArray6, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray12);
        java.lang.String str15 = mathException14.getPattern();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException14);
        java.lang.Class<?> wildcardClass17 = mathException16.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) -1, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl5 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double8 = hypergeometricDistributionImpl5.cumulativeProbability(0, (int) (short) 0);
        double double10 = hypergeometricDistributionImpl5.probability((int) (byte) 0);
        double double12 = hypergeometricDistributionImpl5.probability((int) 'a');
        int int13 = hypergeometricDistributionImpl5.getSampleSize();
        double double15 = hypergeometricDistributionImpl5.probability((double) 10);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        java.lang.Throwable[] throwableArray19 = mathException17.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray22 = mathException21.getSuppressed();
        java.lang.String str23 = mathException21.getPattern();
        java.lang.Throwable[] throwableArray24 = mathException21.getSuppressed();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl28 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double31 = hypergeometricDistributionImpl28.cumulativeProbability(0, (int) (short) 0);
        double double33 = hypergeometricDistributionImpl28.probability((int) (byte) 0);
        double double35 = hypergeometricDistributionImpl28.probability(0.0d);
        hypergeometricDistributionImpl28.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl28.setSampleSize((int) (short) 1);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray43 = mathException42.getSuppressed();
        java.lang.String str44 = mathException42.getPattern();
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException42);
        java.lang.String str46 = mathException42.getPattern();
        java.lang.Object[] objArray47 = new java.lang.Object[] { (-1), 10, mathException17, throwableArray24, (short) 1, str46 };
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray50 = mathException49.getSuppressed();
        java.lang.String str51 = mathException49.getPattern();
        java.lang.Throwable[] throwableArray52 = mathException49.getSuppressed();
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray55 = mathException54.getSuppressed();
        mathException49.addSuppressed((java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException58);
        mathException54.addSuppressed((java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) mathException54);
        java.lang.Class<?> wildcardClass62 = mathException54.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1, 10, org.apache.commons.math.MathException: hi!, [], 1, hi!]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray5 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.String str11 = mathException9.getPattern();
        mathException7.addSuppressed((java.lang.Throwable) mathException9);
        java.lang.String str13 = mathException7.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException7);
        java.lang.Class<?> wildcardClass15 = mathException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, (int) (byte) 1, (int) (byte) 100);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1), (double) (byte) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((double) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray3 = mathException1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 1);
        double double19 = hypergeometricDistributionImpl3.probability((int) '4');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        java.lang.Object[] objArray6 = mathException2.getArguments();
        java.lang.String str7 = mathException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str7, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray11 = mathException10.getSuppressed();
        java.lang.String str12 = mathException10.getPattern();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException14);
        java.lang.String str16 = mathException15.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str16, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((-1), (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((-1));
        double double10 = hypergeometricDistributionImpl3.probability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1, throwableArray6, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray12, (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray17 = mathException15.getArguments();
        java.lang.Throwable[] throwableArray18 = mathException15.getSuppressed();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) mathException20);
        java.lang.String str22 = mathException21.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.MathException: " + "'", str22, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray11 = mathException10.getSuppressed();
        java.lang.String str12 = mathException10.getPattern();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException14);
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException14.addSuppressed(throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        java.lang.String str7 = mathException5.getPattern();
        java.lang.Throwable[] throwableArray8 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray15 = mathException14.getSuppressed();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1, throwableArray15, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", objArray21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray21, (java.lang.Throwable) mathException24);
        java.lang.Object[] objArray26 = mathException24.getArguments();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray30 = mathException29.getSuppressed();
        java.lang.String str31 = mathException29.getPattern();
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException29);
        java.lang.String str33 = mathException29.getPattern();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", objArray26, (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException35);
        mathException1.addSuppressed((java.lang.Throwable) mathException35);
        java.lang.Class<?> wildcardClass38 = mathException35.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        java.lang.String str6 = mathException4.getPattern();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.String str13 = mathException11.getPattern();
        java.lang.Throwable[] throwableArray14 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray17 = mathException16.getSuppressed();
        mathException11.addSuppressed((java.lang.Throwable) mathException16);
        java.lang.Throwable[] throwableArray19 = mathException16.getSuppressed();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray8, (java.lang.Throwable) mathException21);
        java.lang.String str23 = mathException21.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str23, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1, throwableArray6, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray12, (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray17 = mathException15.getArguments();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray21 = mathException20.getSuppressed();
        java.lang.String str22 = mathException20.getPattern();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException20);
        java.lang.String str24 = mathException20.getPattern();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray17, (java.lang.Throwable) mathException20);
        java.lang.String str26 = mathException25.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.MathException: " + "'", str26, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 52);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double18 = hypergeometricDistributionImpl3.probability(35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.String str4 = mathException3.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str4, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass21 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double20 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        int int25 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.6391752577319588d);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize(97);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double25 = hypergeometricDistributionImpl3.probability((-1));
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(0.6391752577319588d, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize(97);
        java.lang.Class<?> wildcardClass9 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 32);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray7 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.lang.String str12 = mathException9.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str12, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 1);
        double double18 = hypergeometricDistributionImpl3.probability((int) ' ');
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException15);
        mathException5.addSuppressed((java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray18 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray21 = mathException20.getSuppressed();
        java.lang.String str22 = mathException20.getPattern();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray31 = mathException30.getSuppressed();
        java.lang.String str32 = mathException30.getPattern();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException33);
        mathException23.addSuppressed((java.lang.Throwable) mathException33);
        java.lang.Throwable[] throwableArray36 = mathException23.getSuppressed();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) mathException23);
        java.lang.String str38 = mathException23.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str38, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, (int) (byte) 1, (int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException15);
        mathException5.addSuppressed((java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray18 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray22 = mathException21.getSuppressed();
        java.lang.String str23 = mathException21.getPattern();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray28 = mathException27.getSuppressed();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray32 = mathException31.getSuppressed();
        java.lang.String str33 = mathException31.getPattern();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) mathException34);
        mathException24.addSuppressed((java.lang.Throwable) mathException34);
        java.lang.Throwable[] throwableArray37 = mathException24.getSuppressed();
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray40 = mathException39.getSuppressed();
        java.lang.String str41 = mathException39.getPattern();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray46 = mathException45.getSuppressed();
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray50 = mathException49.getSuppressed();
        java.lang.String str51 = mathException49.getPattern();
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException49);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) mathException52);
        mathException42.addSuppressed((java.lang.Throwable) mathException52);
        java.lang.Throwable[] throwableArray55 = mathException42.getSuppressed();
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) mathException42);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) mathException42);
        java.lang.Throwable[] throwableArray58 = mathException42.getSuppressed();
        java.lang.Throwable[] throwableArray59 = mathException42.getSuppressed();
        java.lang.Object[] objArray60 = mathException42.getArguments();
        java.lang.String str61 = mathException42.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str61, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray7 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray14 = mathException13.getSuppressed();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1, throwableArray14, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", objArray20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray20, (java.lang.Throwable) mathException23);
        java.lang.Object[] objArray25 = mathException23.getArguments();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray29 = mathException28.getSuppressed();
        java.lang.String str30 = mathException28.getPattern();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException28);
        java.lang.String str32 = mathException28.getPattern();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", objArray25, (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException28);
        java.lang.Throwable[] throwableArray35 = mathException28.getSuppressed();
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException28);
        java.lang.Throwable throwable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException36.addSuppressed(throwable37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 100, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(54, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, (int) (byte) 1, (int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((-1));
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.probability(100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.probability((double) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '#', (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl9 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double12 = hypergeometricDistributionImpl9.cumulativeProbability(0, (int) (short) 0);
        double double14 = hypergeometricDistributionImpl9.probability((int) (byte) 0);
        double double16 = hypergeometricDistributionImpl9.probability((int) 'a');
        int int17 = hypergeometricDistributionImpl9.getSampleSize();
        double double19 = hypergeometricDistributionImpl9.probability((double) 10);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException21);
        java.lang.Throwable[] throwableArray23 = mathException21.getSuppressed();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray26 = mathException25.getSuppressed();
        java.lang.String str27 = mathException25.getPattern();
        java.lang.Throwable[] throwableArray28 = mathException25.getSuppressed();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl32 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double35 = hypergeometricDistributionImpl32.cumulativeProbability(0, (int) (short) 0);
        double double37 = hypergeometricDistributionImpl32.probability((int) (byte) 0);
        double double39 = hypergeometricDistributionImpl32.probability(0.0d);
        hypergeometricDistributionImpl32.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl32.setSampleSize((int) (short) 1);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray47 = mathException46.getSuppressed();
        java.lang.String str48 = mathException46.getPattern();
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException46);
        java.lang.String str50 = mathException46.getPattern();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1), 10, mathException21, throwableArray28, (short) 1, str50 };
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray54 = mathException53.getSuppressed();
        java.lang.String str55 = mathException53.getPattern();
        java.lang.Throwable[] throwableArray56 = mathException53.getSuppressed();
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray59 = mathException58.getSuppressed();
        mathException53.addSuppressed((java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException62);
        mathException58.addSuppressed((java.lang.Throwable) mathException63);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray69 = mathException68.getSuppressed();
        java.lang.String str70 = mathException68.getPattern();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException68);
        java.lang.String str72 = mathException68.getPattern();
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) mathException68);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray76 = mathException75.getSuppressed();
        java.lang.String str77 = mathException75.getPattern();
        java.lang.Throwable[] throwableArray78 = mathException75.getSuppressed();
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) mathException75);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray28);
        java.lang.Class<?> wildcardClass82 = throwableArray28.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, 10, org.apache.commons.math.MathException: hi!, [], 1, hi!]");
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl7 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double10 = hypergeometricDistributionImpl7.cumulativeProbability(0, (int) (short) 0);
        double double12 = hypergeometricDistributionImpl7.probability((int) (byte) 0);
        double double14 = hypergeometricDistributionImpl7.probability((int) 'a');
        int int15 = hypergeometricDistributionImpl7.getSampleSize();
        double double17 = hypergeometricDistributionImpl7.probability((double) 10);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException19);
        java.lang.Throwable[] throwableArray21 = mathException19.getSuppressed();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray24 = mathException23.getSuppressed();
        java.lang.String str25 = mathException23.getPattern();
        java.lang.Throwable[] throwableArray26 = mathException23.getSuppressed();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl30 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double33 = hypergeometricDistributionImpl30.cumulativeProbability(0, (int) (short) 0);
        double double35 = hypergeometricDistributionImpl30.probability((int) (byte) 0);
        double double37 = hypergeometricDistributionImpl30.probability(0.0d);
        hypergeometricDistributionImpl30.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl30.setSampleSize((int) (short) 1);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray45 = mathException44.getSuppressed();
        java.lang.String str46 = mathException44.getPattern();
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException44);
        java.lang.String str48 = mathException44.getPattern();
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1), 10, mathException19, throwableArray26, (short) 1, str48 };
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray52 = mathException51.getSuppressed();
        java.lang.String str53 = mathException51.getPattern();
        java.lang.Throwable[] throwableArray54 = mathException51.getSuppressed();
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray57 = mathException56.getSuppressed();
        mathException51.addSuppressed((java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException60);
        mathException56.addSuppressed((java.lang.Throwable) mathException61);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray67 = mathException66.getSuppressed();
        java.lang.String str68 = mathException66.getPattern();
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException66);
        java.lang.String str70 = mathException66.getPattern();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException66);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray74 = mathException73.getSuppressed();
        java.lang.String str75 = mathException73.getPattern();
        java.lang.Throwable[] throwableArray76 = mathException73.getSuppressed();
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException73);
        java.lang.String str78 = mathException73.toString();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1, 10, org.apache.commons.math.MathException: hi!, [], 1, hi!]");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str78, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) -1, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.probability(100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1, 0.46391752577319584d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) '#');
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        int int23 = hypergeometricDistributionImpl3.getPopulationSize();
        java.lang.Class<?> wildcardClass24 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        java.lang.Class<?> wildcardClass24 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException15);
        mathException5.addSuppressed((java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray18 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray22 = mathException21.getSuppressed();
        java.lang.String str23 = mathException21.getPattern();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray28 = mathException27.getSuppressed();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray32 = mathException31.getSuppressed();
        java.lang.String str33 = mathException31.getPattern();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) mathException34);
        mathException24.addSuppressed((java.lang.Throwable) mathException34);
        java.lang.Throwable[] throwableArray37 = mathException24.getSuppressed();
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray40 = mathException39.getSuppressed();
        java.lang.String str41 = mathException39.getPattern();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray46 = mathException45.getSuppressed();
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray50 = mathException49.getSuppressed();
        java.lang.String str51 = mathException49.getPattern();
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException49);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) mathException52);
        mathException42.addSuppressed((java.lang.Throwable) mathException52);
        java.lang.Throwable[] throwableArray55 = mathException42.getSuppressed();
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) mathException42);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) mathException42);
        java.lang.String str58 = mathException42.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str58, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        java.lang.String str8 = mathException6.getPattern();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray17 = mathException16.getSuppressed();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1, throwableArray17, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray23);
        java.lang.String str26 = mathException25.getPattern();
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException25);
        mathException10.addSuppressed((java.lang.Throwable) mathException27);
        java.lang.Throwable[] throwableArray29 = mathException27.getSuppressed();
        java.lang.Class<?> wildcardClass30 = throwableArray29.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1, throwableArray5, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray11, (java.lang.Throwable) mathException14);
        java.lang.String str16 = mathException14.getPattern();
        java.lang.String str17 = mathException14.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str17, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) 52, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 1);
        double double18 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 1);
        double double19 = hypergeometricDistributionImpl3.probability((int) '4');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) (short) 100);
        int int23 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 54, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) -1, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hypergeometricDistributionImpl3.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 54, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        java.lang.String str7 = mathException5.getPattern();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.Throwable[] throwableArray9 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException12);
        java.lang.Throwable[] throwableArray16 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray20 = mathException19.getArguments();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", objArray20);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1, throwableArray27, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", objArray33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", objArray33, (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray20, (java.lang.Throwable) mathException36);
        java.lang.Class<?> wildcardClass39 = mathException38.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double25 = hypergeometricDistributionImpl3.probability((-1));
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(0.6391752577319588d, (double) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray5 = mathException1.getArguments();
        java.lang.String str6 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str6, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        mathException6.addSuppressed((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray18 = mathException17.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1, throwableArray18, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray24, (java.lang.Throwable) mathException27);
        mathException6.addSuppressed((java.lang.Throwable) mathException28);
        java.lang.Throwable throwable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException28.addSuppressed(throwable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, [], -1, hi!, 0.0, -1]");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1, throwableArray6, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray12, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray12);
        java.lang.Class<?> wildcardClass18 = objArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double17 = hypergeometricDistributionImpl3.probability((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(32, (int) (byte) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(2.536631785480243E-4d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(32, 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 1);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10);
        double double20 = hypergeometricDistributionImpl3.probability(0);
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(2.536631785480243E-4d);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray5 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.String str11 = mathException9.getPattern();
        mathException7.addSuppressed((java.lang.Throwable) mathException9);
        java.lang.String str13 = mathException7.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException7);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl21 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double24 = hypergeometricDistributionImpl21.cumulativeProbability(0, (int) (short) 0);
        double double26 = hypergeometricDistributionImpl21.probability((int) (byte) 0);
        double double28 = hypergeometricDistributionImpl21.probability((int) 'a');
        int int29 = hypergeometricDistributionImpl21.getSampleSize();
        double double31 = hypergeometricDistributionImpl21.probability((double) 10);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException33);
        java.lang.Throwable[] throwableArray35 = mathException33.getSuppressed();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray38 = mathException37.getSuppressed();
        java.lang.String str39 = mathException37.getPattern();
        java.lang.Throwable[] throwableArray40 = mathException37.getSuppressed();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl44 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double47 = hypergeometricDistributionImpl44.cumulativeProbability(0, (int) (short) 0);
        double double49 = hypergeometricDistributionImpl44.probability((int) (byte) 0);
        double double51 = hypergeometricDistributionImpl44.probability(0.0d);
        hypergeometricDistributionImpl44.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl44.setSampleSize((int) (short) 1);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray59 = mathException58.getSuppressed();
        java.lang.String str60 = mathException58.getPattern();
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException58);
        java.lang.String str62 = mathException58.getPattern();
        java.lang.Object[] objArray63 = new java.lang.Object[] { (-1), 10, mathException33, throwableArray40, (short) 1, str62 };
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray66 = mathException65.getSuppressed();
        java.lang.String str67 = mathException65.getPattern();
        java.lang.Throwable[] throwableArray68 = mathException65.getSuppressed();
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray71 = mathException70.getSuppressed();
        mathException65.addSuppressed((java.lang.Throwable) mathException70);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException74);
        mathException70.addSuppressed((java.lang.Throwable) mathException75);
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) mathException70);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray81 = mathException80.getSuppressed();
        java.lang.String str82 = mathException80.getPattern();
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException80);
        java.lang.String str84 = mathException80.getPattern();
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) mathException80);
        mathException1.addSuppressed((java.lang.Throwable) mathException85);
        java.lang.String str87 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[-1, 10, org.apache.commons.math.MathException: hi!, [], 1, hi!]");
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str87, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(52, (int) (short) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl6 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double9 = hypergeometricDistributionImpl6.cumulativeProbability(0, (int) (short) 0);
        double double11 = hypergeometricDistributionImpl6.probability((int) (byte) 0);
        double double13 = hypergeometricDistributionImpl6.probability(0.0d);
        int int14 = hypergeometricDistributionImpl6.getPopulationSize();
        double double16 = hypergeometricDistributionImpl6.upperCumulativeProbability(97);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl20 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int21 = hypergeometricDistributionImpl20.getNumberOfSuccesses();
        hypergeometricDistributionImpl20.setPopulationSize((int) (short) 100);
        double double26 = hypergeometricDistributionImpl20.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        int int27 = hypergeometricDistributionImpl20.getSampleSize();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl31 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int32 = hypergeometricDistributionImpl31.getNumberOfSuccesses();
        int int33 = hypergeometricDistributionImpl31.getNumberOfSuccesses();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl37 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double40 = hypergeometricDistributionImpl37.cumulativeProbability(0, (int) (short) 0);
        int int41 = hypergeometricDistributionImpl37.getNumberOfSuccesses();
        int int42 = hypergeometricDistributionImpl37.getNumberOfSuccesses();
        int int43 = hypergeometricDistributionImpl37.getSampleSize();
        int int44 = hypergeometricDistributionImpl37.getNumberOfSuccesses();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl48 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int49 = hypergeometricDistributionImpl48.getNumberOfSuccesses();
        hypergeometricDistributionImpl48.setPopulationSize((int) (short) 100);
        double double54 = hypergeometricDistributionImpl48.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        int int55 = hypergeometricDistributionImpl48.getSampleSize();
        java.lang.Object[] objArray57 = new java.lang.Object[] { double16, hypergeometricDistributionImpl20, int33, hypergeometricDistributionImpl37, hypergeometricDistributionImpl48, 0 };
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", objArray57);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray65 = mathException64.getSuppressed();
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray69 = mathException68.getSuppressed();
        java.lang.String str70 = mathException68.getPattern();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException68);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray65, (java.lang.Throwable) mathException71);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray79 = mathException78.getSuppressed();
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray85 = new java.lang.Object[] { 1, throwableArray79, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("", objArray85);
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("hi!", objArray85);
        java.lang.String str88 = mathException87.getPattern();
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException87);
        mathException72.addSuppressed((java.lang.Throwable) mathException89);
        java.lang.String str91 = mathException72.getPattern();
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException72);
        mathException59.addSuppressed((java.lang.Throwable) mathException72);
        java.lang.String str94 = mathException72.toString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str94, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double18 = hypergeometricDistributionImpl3.probability(52);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) ' ', (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 10.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.probability(10.0d);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.String str5 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str5, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double11 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.String str8 = mathException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str8, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double23 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double25 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        java.lang.String str7 = mathException5.getPattern();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.Throwable[] throwableArray9 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException12);
        java.lang.Throwable[] throwableArray16 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray20 = mathException19.getArguments();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", objArray20);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1, throwableArray27, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", objArray33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", objArray33, (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray20, (java.lang.Throwable) mathException36);
        java.lang.String str39 = mathException38.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str39, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(52);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.6391752577319617d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        mathException6.addSuppressed((java.lang.Throwable) mathException11);
        java.lang.Object[] objArray13 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.String str16 = mathException15.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str16, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl6 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double9 = hypergeometricDistributionImpl6.cumulativeProbability(0, (int) (short) 0);
        double double11 = hypergeometricDistributionImpl6.probability((int) (byte) 0);
        double double13 = hypergeometricDistributionImpl6.probability(0.0d);
        int int14 = hypergeometricDistributionImpl6.getPopulationSize();
        double double16 = hypergeometricDistributionImpl6.upperCumulativeProbability(97);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl20 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int21 = hypergeometricDistributionImpl20.getNumberOfSuccesses();
        hypergeometricDistributionImpl20.setPopulationSize((int) (short) 100);
        double double26 = hypergeometricDistributionImpl20.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        int int27 = hypergeometricDistributionImpl20.getSampleSize();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl31 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int32 = hypergeometricDistributionImpl31.getNumberOfSuccesses();
        int int33 = hypergeometricDistributionImpl31.getNumberOfSuccesses();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl37 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double40 = hypergeometricDistributionImpl37.cumulativeProbability(0, (int) (short) 0);
        int int41 = hypergeometricDistributionImpl37.getNumberOfSuccesses();
        int int42 = hypergeometricDistributionImpl37.getNumberOfSuccesses();
        int int43 = hypergeometricDistributionImpl37.getSampleSize();
        int int44 = hypergeometricDistributionImpl37.getNumberOfSuccesses();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl48 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int49 = hypergeometricDistributionImpl48.getNumberOfSuccesses();
        hypergeometricDistributionImpl48.setPopulationSize((int) (short) 100);
        double double54 = hypergeometricDistributionImpl48.cumulativeProbability((double) (byte) 1, (double) (byte) 10);
        int int55 = hypergeometricDistributionImpl48.getSampleSize();
        java.lang.Object[] objArray57 = new java.lang.Object[] { double16, hypergeometricDistributionImpl20, int33, hypergeometricDistributionImpl37, hypergeometricDistributionImpl48, 0 };
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", objArray57);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray65 = mathException64.getSuppressed();
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray69 = mathException68.getSuppressed();
        java.lang.String str70 = mathException68.getPattern();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException68);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray65, (java.lang.Throwable) mathException71);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray79 = mathException78.getSuppressed();
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray85 = new java.lang.Object[] { 1, throwableArray79, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("", objArray85);
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("hi!", objArray85);
        java.lang.String str88 = mathException87.getPattern();
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException87);
        mathException72.addSuppressed((java.lang.Throwable) mathException89);
        java.lang.String str91 = mathException72.getPattern();
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException72);
        mathException59.addSuppressed((java.lang.Throwable) mathException72);
        java.lang.String str94 = mathException59.toString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str94, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(2.536631785480243E-4d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double21 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setSampleSize(32);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double15 = hypergeometricDistributionImpl3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999916d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1, throwableArray5, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray11, (java.lang.Throwable) mathException14);
        java.lang.String str16 = mathException14.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str16, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(52);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double21 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(32, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 0);
        hypergeometricDistributionImpl3.setSampleSize(10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 10, (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int6 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability(97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException5.getPattern();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.probability((double) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 0);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, (double) 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, 32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double14 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(51);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double28 = hypergeometricDistributionImpl3.cumulativeProbability(35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(54, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        java.lang.String str10 = mathException8.getPattern();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray19 = mathException18.getSuppressed();
        java.lang.String str20 = mathException18.getPattern();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException18);
        java.lang.String str22 = mathException21.getPattern();
        mathException14.addSuppressed((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException21);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException6.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        double double18 = hypergeometricDistributionImpl3.probability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1, throwableArray12, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", objArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", objArray18, (java.lang.Throwable) mathException21);
        java.lang.Object[] objArray23 = mathException21.getArguments();
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        java.lang.String str28 = mathException26.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException26);
        java.lang.String str30 = mathException26.getPattern();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", objArray23, (java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException26);
        java.lang.String str33 = mathException26.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str33, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 0, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        hypergeometricDistributionImpl3.setSampleSize(0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(54, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1, throwableArray12, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", objArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", objArray18, (java.lang.Throwable) mathException21);
        java.lang.Object[] objArray23 = mathException21.getArguments();
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        java.lang.String str28 = mathException26.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException26);
        java.lang.String str30 = mathException26.getPattern();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", objArray23, (java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException26);
        java.lang.Object[] objArray33 = mathException26.getArguments();
        java.lang.String str34 = mathException26.getPattern();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 54, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, 0.3608247422680412d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) 10.0f);
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability(52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.3608247422680412d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(54);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 54, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        java.lang.String str8 = mathException6.getPattern();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException9);
        java.lang.Class<?> wildcardClass11 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray5 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.String str11 = mathException9.getPattern();
        mathException7.addSuppressed((java.lang.Throwable) mathException9);
        java.lang.String str13 = mathException7.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException7);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl21 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double24 = hypergeometricDistributionImpl21.cumulativeProbability(0, (int) (short) 0);
        double double26 = hypergeometricDistributionImpl21.probability((int) (byte) 0);
        double double28 = hypergeometricDistributionImpl21.probability((int) 'a');
        int int29 = hypergeometricDistributionImpl21.getSampleSize();
        double double31 = hypergeometricDistributionImpl21.probability((double) 10);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException33);
        java.lang.Throwable[] throwableArray35 = mathException33.getSuppressed();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray38 = mathException37.getSuppressed();
        java.lang.String str39 = mathException37.getPattern();
        java.lang.Throwable[] throwableArray40 = mathException37.getSuppressed();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl44 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double47 = hypergeometricDistributionImpl44.cumulativeProbability(0, (int) (short) 0);
        double double49 = hypergeometricDistributionImpl44.probability((int) (byte) 0);
        double double51 = hypergeometricDistributionImpl44.probability(0.0d);
        hypergeometricDistributionImpl44.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl44.setSampleSize((int) (short) 1);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray59 = mathException58.getSuppressed();
        java.lang.String str60 = mathException58.getPattern();
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException58);
        java.lang.String str62 = mathException58.getPattern();
        java.lang.Object[] objArray63 = new java.lang.Object[] { (-1), 10, mathException33, throwableArray40, (short) 1, str62 };
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray66 = mathException65.getSuppressed();
        java.lang.String str67 = mathException65.getPattern();
        java.lang.Throwable[] throwableArray68 = mathException65.getSuppressed();
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray71 = mathException70.getSuppressed();
        mathException65.addSuppressed((java.lang.Throwable) mathException70);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException74);
        mathException70.addSuppressed((java.lang.Throwable) mathException75);
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) mathException70);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray81 = mathException80.getSuppressed();
        java.lang.String str82 = mathException80.getPattern();
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException80);
        java.lang.String str84 = mathException80.getPattern();
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) mathException80);
        mathException1.addSuppressed((java.lang.Throwable) mathException85);
        java.lang.String str87 = mathException85.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[-1, 10, org.apache.commons.math.MathException: hi!, [], 1, hi!]");
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "org.apache.commons.math.MathException: " + "'", str87, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, (double) (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        java.lang.Throwable[] throwableArray6 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        mathException3.addSuppressed((java.lang.Throwable) mathException8);
        java.lang.Throwable[] throwableArray11 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException8);
        java.lang.String str16 = mathException15.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: " + "'", str16, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        java.lang.Throwable[] throwableArray6 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        mathException3.addSuppressed((java.lang.Throwable) mathException8);
        java.lang.Throwable[] throwableArray11 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException8);
        java.lang.String str16 = mathException8.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str16, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 1);
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) 10.0f);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double15 = hypergeometricDistributionImpl3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 54, 0.6391752577319588d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1, throwableArray6, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray12, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        java.lang.Object[] objArray20 = mathException16.getArguments();
        java.lang.String str21 = mathException16.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: " + "'", str21, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 10, 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1, throwableArray7, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", objArray13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray13);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray18 = mathException17.getSuppressed();
        java.lang.String str19 = mathException17.getPattern();
        java.lang.Throwable[] throwableArray20 = mathException17.getSuppressed();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray23 = mathException22.getSuppressed();
        mathException17.addSuppressed((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException26);
        mathException22.addSuppressed((java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray13, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException22);
        java.lang.String str31 = mathException30.getPattern();
        java.lang.Throwable throwable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException30.addSuppressed(throwable32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str31, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) (byte) 100);
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) 35);
        int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.6391752577319588d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray6 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.String str8 = mathException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str8, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.46391752577319584d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 32, 0.6391752577319588d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 52);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double18 = hypergeometricDistributionImpl3.probability(35);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((-1), (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 10.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.probability(10.0d);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '#', 35, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) '4');
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(54);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.46391752577319584d);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        java.lang.String str10 = mathException8.getPattern();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray20 = mathException19.getSuppressed();
        java.lang.String str21 = mathException19.getPattern();
        java.lang.Throwable[] throwableArray22 = mathException19.getSuppressed();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray25 = mathException24.getSuppressed();
        mathException19.addSuppressed((java.lang.Throwable) mathException24);
        java.lang.Throwable[] throwableArray27 = mathException24.getSuppressed();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException24);
        mathException15.addSuppressed((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException24);
        java.lang.String str32 = mathException31.getPattern();
        java.lang.String str33 = mathException31.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str32, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str33, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double20 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray8 = mathException7.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.String str13 = mathException11.getPattern();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException18);
        java.lang.String str20 = mathException19.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str20, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((-1));
        double double10 = hypergeometricDistributionImpl3.probability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double22 = hypergeometricDistributionImpl3.probability((double) 32);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(52);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability(52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.probability(0);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        double double26 = hypergeometricDistributionImpl3.probability(35);
        java.lang.Class<?> wildcardClass27 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0.6391752577319588d, (double) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, 0.6391752577319617d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        java.lang.String str6 = mathException4.getPattern();
        mathException2.addSuppressed((java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray8 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        mathException10.addSuppressed((java.lang.Throwable) mathException12);
        java.lang.String str16 = mathException10.getPattern();
        java.lang.String str17 = mathException10.getPattern();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray21 = mathException20.getSuppressed();
        java.lang.String str22 = mathException20.getPattern();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException20);
        mathException10.addSuppressed((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException10);
        java.lang.String str26 = mathException10.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str26, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        java.lang.Class<?> wildcardClass22 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability(54, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d, (double) ' ');
        double double26 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Class<?> wildcardClass2 = mathException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', 0.5360824742268042d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1, throwableArray6, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray12, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        java.lang.Class<?> wildcardClass20 = mathException19.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1, throwableArray5, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray11, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException15);
        java.lang.String str17 = mathException15.getPattern();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException15);
        java.lang.Class<?> wildcardClass19 = mathException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double13 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        mathException6.addSuppressed((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray18 = mathException17.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1, throwableArray18, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray24, (java.lang.Throwable) mathException27);
        mathException6.addSuppressed((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException30);
        java.lang.String str32 = mathException31.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.MathException: " + "'", str32, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(51, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = hypergeometricDistributionImpl3.cumulativeProbability(97, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d, 0.46391752577319584d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability((double) 1);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 1, 10);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) '#');
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(32, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((-1));
        double double10 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double12 = hypergeometricDistributionImpl3.probability(35);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 97);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10, 52);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        double double31 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), 10.0d);
        double double33 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int6 = hypergeometricDistributionImpl3.getPopulationSize();
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.probability(100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double6 = hypergeometricDistributionImpl3.probability((int) '4');
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        java.lang.String str6 = mathException4.getPattern();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray8 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.String str13 = mathException11.getPattern();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray15 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException16);
        java.lang.Object[] objArray19 = mathException18.getArguments();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", objArray19);
        java.lang.String str21 = mathException20.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: " + "'", str21, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 52);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double18 = hypergeometricDistributionImpl3.probability(35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        int int21 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        java.lang.String str10 = mathException8.getPattern();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        java.lang.String str19 = mathException18.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.8969072164948502d, 2.536631785480243E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double18 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(54);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability(97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) 10.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize(54);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.5360824742268042d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '#', 35, (int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double12 = hypergeometricDistributionImpl3.probability(0.5360824742268042d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability(51, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int24 = hypergeometricDistributionImpl3.getPopulationSize();
        int int25 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.probability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.8969072164948502d, 0.46391752577319584d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        java.lang.String str10 = mathException8.getPattern();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray19 = mathException18.getSuppressed();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1, throwableArray19, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", objArray25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray25);
        java.lang.String str28 = mathException27.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException27);
        mathException12.addSuppressed((java.lang.Throwable) mathException29);
        java.lang.String str31 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException12);
        java.lang.String str33 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        java.lang.String str35 = mathException12.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str35, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setSampleSize(32);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability(1.0784569603213913E-17d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl8 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double11 = hypergeometricDistributionImpl8.cumulativeProbability(0, (int) (short) 0);
        double double13 = hypergeometricDistributionImpl8.probability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl8.probability((int) 'a');
        int int16 = hypergeometricDistributionImpl8.getSampleSize();
        double double18 = hypergeometricDistributionImpl8.probability((double) 10);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.Throwable[] throwableArray22 = mathException20.getSuppressed();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray25 = mathException24.getSuppressed();
        java.lang.String str26 = mathException24.getPattern();
        java.lang.Throwable[] throwableArray27 = mathException24.getSuppressed();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl31 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double34 = hypergeometricDistributionImpl31.cumulativeProbability(0, (int) (short) 0);
        double double36 = hypergeometricDistributionImpl31.probability((int) (byte) 0);
        double double38 = hypergeometricDistributionImpl31.probability(0.0d);
        hypergeometricDistributionImpl31.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl31.setSampleSize((int) (short) 1);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray46 = mathException45.getSuppressed();
        java.lang.String str47 = mathException45.getPattern();
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException45);
        java.lang.String str49 = mathException45.getPattern();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1), 10, mathException20, throwableArray27, (short) 1, str49 };
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray53 = mathException52.getSuppressed();
        java.lang.String str54 = mathException52.getPattern();
        java.lang.Throwable[] throwableArray55 = mathException52.getSuppressed();
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray58 = mathException57.getSuppressed();
        mathException52.addSuppressed((java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException61);
        mathException57.addSuppressed((java.lang.Throwable) mathException62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray68 = mathException67.getSuppressed();
        java.lang.String str69 = mathException67.getPattern();
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException67);
        java.lang.String str71 = mathException67.getPattern();
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException67);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray75 = mathException74.getSuppressed();
        java.lang.String str76 = mathException74.getPattern();
        java.lang.Throwable[] throwableArray77 = mathException74.getSuppressed();
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException74);
        java.lang.Object[] objArray79 = mathException74.getArguments();
        java.lang.Object[] objArray80 = mathException74.getArguments();
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray85 = mathException84.getSuppressed();
        java.lang.String str86 = mathException84.getPattern();
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException84);
        java.lang.Throwable[] throwableArray88 = mathException84.getSuppressed();
        java.lang.Throwable[] throwableArray89 = mathException84.getSuppressed();
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray89);
        org.apache.commons.math.MathException mathException91 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray80, (java.lang.Throwable) mathException90);
        java.lang.String str92 = mathException91.getPattern();
        java.lang.Class<?> wildcardClass93 = mathException91.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 10, org.apache.commons.math.MathException: hi!, [], 1, hi!]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str92, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 52);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability(2.536631785480243E-4d);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 51);
        int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException3);
        java.lang.String str8 = mathException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str8, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray11 = mathException10.getSuppressed();
        java.lang.String str12 = mathException10.getPattern();
        mathException8.addSuppressed((java.lang.Throwable) mathException10);
        java.lang.Throwable[] throwableArray14 = mathException10.getSuppressed();
        java.lang.Throwable[] throwableArray15 = mathException10.getSuppressed();
        mathException3.addSuppressed((java.lang.Throwable) mathException10);
        java.lang.Class<?> wildcardClass17 = mathException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) '#');
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (short) 100);
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((double) 1.0f);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str2, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        java.lang.String str7 = mathException5.getPattern();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray9 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.String str14 = mathException12.getPattern();
        java.lang.Throwable[] throwableArray15 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray18 = mathException17.getSuppressed();
        mathException12.addSuppressed((java.lang.Throwable) mathException17);
        java.lang.Throwable[] throwableArray20 = mathException17.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray9, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        java.lang.String str28 = mathException26.getPattern();
        java.lang.Throwable[] throwableArray29 = mathException26.getSuppressed();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray32 = mathException31.getSuppressed();
        mathException26.addSuppressed((java.lang.Throwable) mathException31);
        java.lang.Throwable[] throwableArray34 = mathException31.getSuppressed();
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException31);
        java.lang.Throwable[] throwableArray37 = mathException31.getSuppressed();
        mathException23.addSuppressed((java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException39);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize(10);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double25 = hypergeometricDistributionImpl3.probability((-1));
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(0.6391752577319588d, (double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(19);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) '4');
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) '#');
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        int int25 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = hypergeometricDistributionImpl3.cumulativeProbability(54, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.probability(100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 0.0f);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.lang.String str5 = mathException3.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray7 = mathException3.getSuppressed();
        java.lang.Throwable[] throwableArray8 = mathException3.getSuppressed();
        java.lang.Class<?> wildcardClass9 = mathException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 0, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistributionImpl3.cumulativeProbability(35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.probability((double) 100L);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999916d, (double) '4');
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.3608247422680412d + "'", double20 == 0.3608247422680412d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl8 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double11 = hypergeometricDistributionImpl8.cumulativeProbability(0, (int) (short) 0);
        double double13 = hypergeometricDistributionImpl8.probability((int) (byte) 0);
        double double15 = hypergeometricDistributionImpl8.probability((int) 'a');
        int int16 = hypergeometricDistributionImpl8.getSampleSize();
        double double18 = hypergeometricDistributionImpl8.probability((double) 10);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.Throwable[] throwableArray22 = mathException20.getSuppressed();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray25 = mathException24.getSuppressed();
        java.lang.String str26 = mathException24.getPattern();
        java.lang.Throwable[] throwableArray27 = mathException24.getSuppressed();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl31 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double34 = hypergeometricDistributionImpl31.cumulativeProbability(0, (int) (short) 0);
        double double36 = hypergeometricDistributionImpl31.probability((int) (byte) 0);
        double double38 = hypergeometricDistributionImpl31.probability(0.0d);
        hypergeometricDistributionImpl31.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl31.setSampleSize((int) (short) 1);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray46 = mathException45.getSuppressed();
        java.lang.String str47 = mathException45.getPattern();
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException45);
        java.lang.String str49 = mathException45.getPattern();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1), 10, mathException20, throwableArray27, (short) 1, str49 };
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray53 = mathException52.getSuppressed();
        java.lang.String str54 = mathException52.getPattern();
        java.lang.Throwable[] throwableArray55 = mathException52.getSuppressed();
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray58 = mathException57.getSuppressed();
        mathException52.addSuppressed((java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException61);
        mathException57.addSuppressed((java.lang.Throwable) mathException62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray68 = mathException67.getSuppressed();
        java.lang.String str69 = mathException67.getPattern();
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException67);
        java.lang.String str71 = mathException67.getPattern();
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException67);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray75 = mathException74.getSuppressed();
        java.lang.String str76 = mathException74.getPattern();
        java.lang.Throwable[] throwableArray77 = mathException74.getSuppressed();
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) mathException74);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException78);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException78);
        java.lang.String str82 = mathException78.getPattern();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 10, org.apache.commons.math.MathException: hi!, [], 1, hi!]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str82, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) '4');
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(54);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.46391752577319584d);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(35, 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 10);
        double double20 = hypergeometricDistributionImpl3.probability(0);
        int int22 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double29 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(1, 54);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(32, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistributionImpl3.cumulativeProbability(1.7951406312258777E-15d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str3, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d, 0.010309278350515464d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        mathException6.addSuppressed((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray18 = mathException17.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1, throwableArray18, (-1), "hi!", 0.0f, (byte) -1 };
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray24, (java.lang.Throwable) mathException27);
        mathException6.addSuppressed((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        java.lang.String str31 = mathException28.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, [], -1, hi!, 0.0, -1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.MathException: " + "'", str31, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        java.lang.Class<?> wildcardClass14 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Throwable[] throwableArray4 = mathException1.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        mathException6.addSuppressed((java.lang.Throwable) mathException11);
        java.lang.String str13 = mathException6.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str13, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize(10);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        double double16 = hypergeometricDistributionImpl3.probability(0.0d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        double double20 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        java.lang.String str6 = mathException4.getPattern();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray8 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.String str13 = mathException11.getPattern();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray15 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        java.lang.String str20 = mathException16.getPattern();
        java.lang.String str21 = mathException16.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str20, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str21, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) 10.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.46391752577319584d);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(97);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) ' ');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) 52);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 0);
        hypergeometricDistributionImpl3.setSampleSize(10);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, 0.0d);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 51, 0.6391752577319617d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double14 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(32);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = hypergeometricDistributionImpl3.cumulativeProbability((double) 51, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.getPattern();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray6 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.String str8 = mathException7.getPattern();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) 100L);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        int int22 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, (double) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(35, 0, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) '4', (int) (short) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) (short) 0);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability(0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setPopulationSize(1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }
}

