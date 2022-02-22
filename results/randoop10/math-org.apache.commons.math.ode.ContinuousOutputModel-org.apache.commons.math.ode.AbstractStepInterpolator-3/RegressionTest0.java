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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        java.lang.String str5 = mathException4.getPattern();
        java.lang.String str6 = mathException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: hi!" + "'", str5, "java.io.IOException: hi!");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        java.lang.Class<?> wildcardClass2 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str2, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass6 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str2, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String str6 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: " + "'", str6, "java.io.IOException: ");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String str6 = derivativeException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: hi!");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        mathException3.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Class<?> wildcardClass11 = iOException9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: " + "'", str5, "java.io.IOException: ");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) mathException10);
        iOException5.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String str13 = iOException11.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str13, "java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Throwable[] throwableArray9 = derivativeException8.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        java.lang.Class<?> wildcardClass11 = mathException10.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray11);
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11, (java.lang.Throwable) iOException20);
        java.lang.String str22 = iOException20.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str22, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel11.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel11);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel11.handleStep(stepInterpolator21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray2 = mathException1.getArguments();
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String str11 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str3, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.io.IOException iOException17 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        derivativeException15.addSuppressed((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) derivativeException15);
        java.io.IOException iOException23 = new java.io.IOException("hi!");
        java.io.IOException iOException24 = new java.io.IOException("", (java.lang.Throwable) iOException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray6, (java.lang.Throwable) iOException24);
        java.io.IOException iOException33 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException33);
        java.lang.Object[] objArray36 = mathException35.getArguments();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray36);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        double double44 = continuousOutputModel40.getInitialTime();
        java.io.IOException iOException47 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException47);
        java.io.IOException iOException52 = new java.io.IOException("hi!");
        java.io.IOException iOException53 = new java.io.IOException("", (java.lang.Throwable) iOException52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException52);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double57 = continuousOutputModel56.getFinalTime();
        double double58 = continuousOutputModel56.getInitialTime();
        java.lang.Object[] objArray59 = new java.lang.Object[] { double44, mathException49, iOException52, false, continuousOutputModel56 };
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("", strArray68);
        java.io.IOException iOException73 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException73);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException73);
        java.lang.Object[] objArray76 = mathException75.getArguments();
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException75);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray68, (java.lang.Throwable) mathException75);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray59, (java.lang.Throwable) mathException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray36, (java.lang.Throwable) mathException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray6, (java.lang.Throwable) mathException80);
        java.lang.Class<?> wildcardClass82 = mathException81.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        java.lang.Class<?> wildcardClass13 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str2, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double4 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double7 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        java.lang.Object[] objArray17 = mathException16.getArguments();
        java.lang.String str18 = mathException16.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: " + "'", str18, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.Throwable[] throwableArray1 = iOException0.getSuppressed();
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException0);
        java.lang.String str3 = iOException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException" + "'", str3, "java.io.IOException");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.lang.String str9 = derivativeException8.getPattern();
        java.lang.Class<?> wildcardClass10 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: " + "'", str9, "java.io.IOException: ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = mathException5.getArguments();
        java.lang.Class<?> wildcardClass8 = mathException5.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray12);
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        mathException24.addSuppressed((java.lang.Throwable) iOException26);
        mathException22.addSuppressed((java.lang.Throwable) mathException24);
        java.io.IOException iOException30 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException24);
        java.lang.String str31 = iOException30.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str31, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        java.lang.Class<?> wildcardClass5 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        java.lang.Class<?> wildcardClass7 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) mathException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str3, "java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel8.handleStep(stepInterpolator13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.lang.String str9 = derivativeException8.getPattern();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.lang.String str11 = derivativeException8.getPattern();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: " + "'", str9, "java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: " + "'", str11, "java.io.IOException: ");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException5);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", objArray8);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getFinalTime();
        double double14 = continuousOutputModel12.getInitialTime();
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        double double16 = continuousOutputModel12.getInitialTime();
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException19);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException24);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double29 = continuousOutputModel28.getFinalTime();
        double double30 = continuousOutputModel28.getInitialTime();
        java.lang.Object[] objArray31 = new java.lang.Object[] { double16, mathException21, iOException24, false, continuousOutputModel28 };
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        java.io.IOException iOException45 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException45);
        java.lang.Object[] objArray48 = mathException47.getArguments();
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray40, (java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray31, (java.lang.Throwable) mathException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8, (java.lang.Throwable) mathException51);
        java.lang.String str53 = mathException51.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str53, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass8 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.lang.Class<?> wildcardClass6 = iOException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass7 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.Class<?> wildcardClass10 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException5);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", objArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8);
        java.lang.Class<?> wildcardClass12 = mathException11.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.io.IOException iOException17 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        derivativeException15.addSuppressed((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) derivativeException15);
        java.io.IOException iOException23 = new java.io.IOException("hi!");
        java.io.IOException iOException24 = new java.io.IOException("", (java.lang.Throwable) iOException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray6, (java.lang.Throwable) iOException24);
        java.io.IOException iOException33 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException33);
        java.lang.Object[] objArray36 = mathException35.getArguments();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray36);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        double double44 = continuousOutputModel40.getInitialTime();
        java.io.IOException iOException47 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException47);
        java.io.IOException iOException52 = new java.io.IOException("hi!");
        java.io.IOException iOException53 = new java.io.IOException("", (java.lang.Throwable) iOException52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException52);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double57 = continuousOutputModel56.getFinalTime();
        double double58 = continuousOutputModel56.getInitialTime();
        java.lang.Object[] objArray59 = new java.lang.Object[] { double44, mathException49, iOException52, false, continuousOutputModel56 };
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("", strArray68);
        java.io.IOException iOException73 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException73);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException73);
        java.lang.Object[] objArray76 = mathException75.getArguments();
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException75);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray68, (java.lang.Throwable) mathException75);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray59, (java.lang.Throwable) mathException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray36, (java.lang.Throwable) mathException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray6, (java.lang.Throwable) mathException80);
        java.lang.String str82 = mathException80.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str82, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        double double12 = continuousOutputModel4.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        java.lang.Class<?> wildcardClass8 = iOException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        double double12 = continuousOutputModel4.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel16.append(continuousOutputModel20);
        continuousOutputModel5.append(continuousOutputModel16);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel16.handleStep(stepInterpolator25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean21 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel17);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.setInterpolatedTime((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException3);
        java.lang.String str6 = mathException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        mathException3.addSuppressed((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.lang.String str12 = mathException3.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: " + "'", str12, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean26 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel21);
        continuousOutputModel17.reset();
        continuousOutputModel9.append(continuousOutputModel17);
        java.lang.Class<?> wildcardClass30 = continuousOutputModel9.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray12);
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        mathException24.addSuppressed((java.lang.Throwable) iOException26);
        mathException22.addSuppressed((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        java.lang.Class<?> wildcardClass33 = mathException22.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException13);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) mathException15);
        java.lang.String str19 = mathException18.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) derivativeException20);
        java.lang.String str22 = derivativeException20.getPattern();
        java.lang.Class<?> wildcardClass23 = derivativeException20.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str19, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str22, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException18);
        derivativeException16.addSuppressed((java.lang.Throwable) iOException18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray7, (java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray7);
        java.io.IOException iOException33 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException35);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) mathException35);
        java.lang.Class<?> wildcardClass38 = mathException35.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException6);
        java.lang.String str9 = mathException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str9, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray11);
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11, (java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        mathException23.addSuppressed((java.lang.Throwable) iOException25);
        mathException21.addSuppressed((java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException21);
        java.lang.Class<?> wildcardClass30 = mathException21.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException6);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double14 = continuousOutputModel13.getFinalTime();
        double double15 = continuousOutputModel13.getInitialTime();
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        double double17 = continuousOutputModel13.getInitialTime();
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException20);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double30 = continuousOutputModel29.getFinalTime();
        double double31 = continuousOutputModel29.getInitialTime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { double17, mathException22, iOException25, false, continuousOutputModel29 };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException46);
        java.lang.Object[] objArray49 = mathException48.getArguments();
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray41, (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray32, (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9, (java.lang.Throwable) mathException52);
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException54);
        java.io.IOException iOException57 = new java.io.IOException("hi!");
        mathException55.addSuppressed((java.lang.Throwable) iOException57);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException55);
        java.lang.String str60 = mathException59.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str60, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.lang.Object[] objArray1 = null;
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException10);
        java.lang.Object[] objArray13 = mathException12.getArguments();
        mathException7.addSuppressed((java.lang.Throwable) mathException12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray1, (java.lang.Throwable) mathException7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.Object[] objArray3 = derivativeException2.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException2);
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.lang.Class<?> wildcardClass6 = mathException4.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray9 = iOException5.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("hi!");
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) iOException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException13);
        java.lang.String str15 = mathException14.getPattern();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException2);
        java.lang.String str4 = mathException3.getPattern();
        java.lang.Class<?> wildcardClass5 = mathException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass6 = iOException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException13);
        java.lang.String str15 = mathException14.getPattern();
        iOException7.addSuppressed((java.lang.Throwable) mathException14);
        java.lang.String str17 = iOException7.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str17, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Object[] objArray4 = derivativeException3.getArguments();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        derivativeException13.addSuppressed((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray4, (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException18);
        java.lang.Class<?> wildcardClass20 = mathException18.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.append(continuousOutputModel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.String[] strArray2 = new java.lang.String[] { "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray2);
        java.lang.String str4 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str4, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException6);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double14 = continuousOutputModel13.getFinalTime();
        double double15 = continuousOutputModel13.getInitialTime();
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        double double17 = continuousOutputModel13.getInitialTime();
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException20);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double30 = continuousOutputModel29.getFinalTime();
        double double31 = continuousOutputModel29.getInitialTime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { double17, mathException22, iOException25, false, continuousOutputModel29 };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException46);
        java.lang.Object[] objArray49 = mathException48.getArguments();
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray41, (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray32, (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9, (java.lang.Throwable) mathException52);
        java.io.IOException iOException57 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException57);
        java.lang.Object[] objArray59 = derivativeException58.getArguments();
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("", strArray67);
        java.io.IOException iOException70 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException70);
        derivativeException68.addSuppressed((java.lang.Throwable) iOException70);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("hi!", objArray59, (java.lang.Throwable) derivativeException68);
        java.io.IOException iOException76 = new java.io.IOException("hi!");
        java.io.IOException iOException77 = new java.io.IOException("", (java.lang.Throwable) iOException76);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException77);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException77);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray59, (java.lang.Throwable) iOException77);
        java.io.IOException iOException83 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException83);
        iOException77.addSuppressed((java.lang.Throwable) iOException83);
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray9, (java.lang.Throwable) iOException83);
        java.lang.String str87 = iOException83.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "java.io.IOException: hi!" + "'", str87, "java.io.IOException: hi!");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        double double11 = continuousOutputModel5.getFinalTime();
        java.lang.Class<?> wildcardClass12 = continuousOutputModel5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel16.append(continuousOutputModel20);
        continuousOutputModel5.append(continuousOutputModel16);
        boolean boolean25 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel16.handleStep(stepInterpolator26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str2, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        double double13 = continuousOutputModel8.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel8.handleStep(stepInterpolator14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel4.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.reset();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        double double24 = continuousOutputModel22.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel22);
        continuousOutputModel4.append(continuousOutputModel22);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = continuousOutputModel22.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double7 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray9);
        java.lang.String str13 = derivativeException12.getPattern();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str13, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.io.IOException iOException1 = new java.io.IOException();
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray2);
        java.lang.String str4 = mathException3.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str4, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: hi!" + "'", str7, "java.io.IOException: hi!");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        double double12 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        double double17 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.Throwable[] throwableArray10 = derivativeException9.getSuppressed();
        java.lang.Throwable throwable11 = null;
        java.io.IOException iOException12 = new java.io.IOException(throwable11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) iOException12);
        java.lang.String str14 = iOException12.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException" + "'", str14, "java.io.IOException");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException6);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        java.lang.String str13 = mathException12.getPattern();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException();
        mathException12.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) mathException12);
        java.lang.String str17 = mathException12.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.MathException: " + "'", str13, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str17, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException2);
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.lang.Throwable[] throwableArray6 = mathException4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass4 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean13 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel4);
        double double16 = continuousOutputModel4.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray10);
        java.lang.String str15 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str15, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean26 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel21);
        continuousOutputModel17.reset();
        continuousOutputModel9.append(continuousOutputModel17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel17.handleStep(stepInterpolator30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException13);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) mathException15);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        double double13 = continuousOutputModel8.getInitialTime();
        continuousOutputModel8.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = continuousOutputModel8.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getInitialTime();
        double double14 = continuousOutputModel5.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException18);
        derivativeException16.addSuppressed((java.lang.Throwable) iOException18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray7, (java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray7);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray7);
        java.lang.Class<?> wildcardClass31 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel8.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean13 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("", objArray1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        java.lang.String str6 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.io.IOException iOException14 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException14);
        java.lang.Object[] objArray17 = mathException16.getArguments();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray17);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        double double25 = continuousOutputModel21.getInitialTime();
        java.io.IOException iOException28 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException28);
        java.io.IOException iOException33 = new java.io.IOException("hi!");
        java.io.IOException iOException34 = new java.io.IOException("", (java.lang.Throwable) iOException33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double38 = continuousOutputModel37.getFinalTime();
        double double39 = continuousOutputModel37.getInitialTime();
        java.lang.Object[] objArray40 = new java.lang.Object[] { double25, mathException30, iOException33, false, continuousOutputModel37 };
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray49);
        java.io.IOException iOException54 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException54);
        java.lang.Object[] objArray57 = mathException56.getArguments();
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray49, (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray40, (java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray17, (java.lang.Throwable) mathException60);
        derivativeException8.addSuppressed((java.lang.Throwable) mathException60);
        java.lang.String str63 = mathException60.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str63, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double4 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel4.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException3);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray18);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray18, (java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException32 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException32);
        mathException30.addSuppressed((java.lang.Throwable) iOException32);
        mathException28.addSuppressed((java.lang.Throwable) mathException30);
        java.io.IOException iOException36 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException30);
        iOException3.addSuppressed((java.lang.Throwable) iOException36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException36);
        java.lang.Class<?> wildcardClass39 = derivativeException38.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = iOException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean21 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.Object[] objArray1 = null;
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException18);
        derivativeException16.addSuppressed((java.lang.Throwable) iOException18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray7, (java.lang.Throwable) iOException25);
        java.lang.Object[] objArray29 = mathException28.getArguments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", objArray1, (java.lang.Throwable) mathException28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException15);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray18);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        double double26 = continuousOutputModel22.getInitialTime();
        java.io.IOException iOException29 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException29);
        java.io.IOException iOException34 = new java.io.IOException("hi!");
        java.io.IOException iOException35 = new java.io.IOException("", (java.lang.Throwable) iOException34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double39 = continuousOutputModel38.getFinalTime();
        double double40 = continuousOutputModel38.getInitialTime();
        java.lang.Object[] objArray41 = new java.lang.Object[] { double26, mathException31, iOException34, false, continuousOutputModel38 };
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray50);
        java.io.IOException iOException55 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException55);
        java.lang.Object[] objArray58 = mathException57.getArguments();
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray50, (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray41, (java.lang.Throwable) mathException60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18, (java.lang.Throwable) mathException61);
        derivativeException9.addSuppressed((java.lang.Throwable) mathException61);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException9);
        java.lang.String str65 = mathException64.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str65, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean13 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass4 = mathException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel16.append(continuousOutputModel20);
        continuousOutputModel5.append(continuousOutputModel16);
        double double25 = continuousOutputModel16.getInitialTime();
        java.lang.Class<?> wildcardClass26 = continuousOutputModel16.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException6);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray9, (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException12);
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.lang.Class<?> wildcardClass17 = iOException15.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double7 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel8.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: java.io.IOException: hi!" + "'", str5, "java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean13 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel4);
        double double16 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: ");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str2, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.io.IOException iOException14 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException14);
        java.lang.Object[] objArray17 = mathException16.getArguments();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray17);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        double double25 = continuousOutputModel21.getInitialTime();
        java.io.IOException iOException28 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException28);
        java.io.IOException iOException33 = new java.io.IOException("hi!");
        java.io.IOException iOException34 = new java.io.IOException("", (java.lang.Throwable) iOException33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double38 = continuousOutputModel37.getFinalTime();
        double double39 = continuousOutputModel37.getInitialTime();
        java.lang.Object[] objArray40 = new java.lang.Object[] { double25, mathException30, iOException33, false, continuousOutputModel37 };
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray49);
        java.io.IOException iOException54 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException54);
        java.lang.Object[] objArray57 = mathException56.getArguments();
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray49, (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray40, (java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray17, (java.lang.Throwable) mathException60);
        derivativeException8.addSuppressed((java.lang.Throwable) mathException60);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException60);
        java.lang.String str64 = mathException60.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str64, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException13);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) mathException15);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        java.lang.Class<?> wildcardClass23 = derivativeException22.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.String str3 = mathException1.getPattern();
        java.lang.Class<?> wildcardClass4 = mathException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        java.io.IOException iOException12 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = mathException14.getArguments();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray15, (java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException19);
        mathException5.addSuppressed((java.lang.Throwable) mathException19);
        java.lang.String str22 = mathException19.toString();
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str22, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException9);
        java.lang.Object[] objArray12 = mathException11.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray12, (java.lang.Throwable) mathException15);
        iOException4.addSuppressed((java.lang.Throwable) mathException16);
        java.lang.String str18 = mathException16.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException16);
        java.lang.String str20 = derivativeException19.toString();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str18, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!" + "'", str20, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException6);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double14 = continuousOutputModel13.getFinalTime();
        double double15 = continuousOutputModel13.getInitialTime();
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        double double17 = continuousOutputModel13.getInitialTime();
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException20);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double30 = continuousOutputModel29.getFinalTime();
        double double31 = continuousOutputModel29.getInitialTime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { double17, mathException22, iOException25, false, continuousOutputModel29 };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException46);
        java.lang.Object[] objArray49 = mathException48.getArguments();
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray41, (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray32, (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9, (java.lang.Throwable) mathException52);
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException54);
        java.io.IOException iOException57 = new java.io.IOException("hi!");
        mathException55.addSuppressed((java.lang.Throwable) iOException57);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException55);
        java.lang.Class<?> wildcardClass60 = mathException59.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException13);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) mathException15);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        java.lang.String str22 = iOException19.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str22, "java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean16 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel11);
        continuousOutputModel5.append(continuousOutputModel7);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean24 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel19);
        continuousOutputModel0.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = continuousOutputModel19.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.append(continuousOutputModel5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel20);
        double double24 = continuousOutputModel16.getInitialTime();
        double double25 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        continuousOutputModel26.reset();
        double double30 = continuousOutputModel26.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel26);
        continuousOutputModel0.append(continuousOutputModel16);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel16.handleStep(stepInterpolator33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray4);
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("hi!", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray15 = iOException11.getSuppressed();
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException19);
        java.lang.String str21 = mathException20.getPattern();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray4, (java.lang.Throwable) mathException23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray4);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException25);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.io.IOException iOException12 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        derivativeException10.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray24);
        iOException12.addSuppressed((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException12);
        java.io.IOException iOException30 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException29);
        java.lang.String str31 = iOException30.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str31, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray3);
        java.lang.String str6 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean16 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel11);
        continuousOutputModel5.append(continuousOutputModel7);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean24 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel19);
        continuousOutputModel0.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.setInterpolatedTime((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean13 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel4);
        double double16 = continuousOutputModel4.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        continuousOutputModel4.append(continuousOutputModel17);
        boolean boolean22 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        java.lang.Class<?> wildcardClass21 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.io.IOException iOException14 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException14);
        java.lang.Object[] objArray17 = mathException16.getArguments();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException19);
        java.lang.Throwable[] throwableArray21 = mathException19.getSuppressed();
        java.lang.Throwable[] throwableArray22 = mathException19.getSuppressed();
        java.lang.Object[] objArray23 = mathException19.getArguments();
        java.lang.Class<?> wildcardClass24 = mathException19.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel20);
        double double24 = continuousOutputModel16.getInitialTime();
        double double25 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        continuousOutputModel26.reset();
        double double30 = continuousOutputModel26.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel26);
        continuousOutputModel0.append(continuousOutputModel16);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel10.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel10.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", objArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.String str7 = iOException5.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str7, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel20);
        double double24 = continuousOutputModel16.getInitialTime();
        double double25 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        continuousOutputModel26.reset();
        double double30 = continuousOutputModel26.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel26);
        continuousOutputModel0.append(continuousOutputModel16);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        boolean boolean21 = continuousOutputModel0.requiresDenseOutput();
        double double22 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean16 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel11);
        continuousOutputModel5.append(continuousOutputModel7);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean24 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel19);
        continuousOutputModel0.append(continuousOutputModel19);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.handleStep(stepInterpolator27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        double double12 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Throwable[] throwableArray9 = derivativeException8.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: org.apache.commons.math.MathException: hi!", throwable1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str3, "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel7.requiresDenseOutput();
        double double10 = continuousOutputModel7.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel11);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        continuousOutputModel0.append(continuousOutputModel7);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        double double14 = continuousOutputModel10.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel10);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel10.setInterpolatedTime((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String str11 = derivativeException10.getPattern();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        double double17 = continuousOutputModel0.getInitialTime();
        boolean boolean18 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException5);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", objArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) mathException10);
        java.lang.String str12 = mathException10.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str12, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException6);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray9, (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException12);
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException14);
        java.lang.Throwable[] throwableArray16 = mathException14.getSuppressed();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str2, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException4);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray18);
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) iOException26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        java.io.IOException iOException29 = new java.io.IOException("hi!", (java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) mathException30);
        iOException4.addSuppressed((java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException4);
        java.lang.Class<?> wildcardClass34 = mathException33.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        double double12 = continuousOutputModel4.getInitialTime();
        continuousOutputModel4.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException6);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double14 = continuousOutputModel13.getFinalTime();
        double double15 = continuousOutputModel13.getInitialTime();
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        double double17 = continuousOutputModel13.getInitialTime();
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException20);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double30 = continuousOutputModel29.getFinalTime();
        double double31 = continuousOutputModel29.getInitialTime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { double17, mathException22, iOException25, false, continuousOutputModel29 };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException46);
        java.lang.Object[] objArray49 = mathException48.getArguments();
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray41, (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray32, (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray9, (java.lang.Throwable) mathException52);
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException54);
        java.io.IOException iOException57 = new java.io.IOException("hi!");
        mathException55.addSuppressed((java.lang.Throwable) iOException57);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException55);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException59);
        java.lang.String str61 = derivativeException60.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str61, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        java.lang.String str11 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException5.getPattern();
        java.lang.Object[] objArray8 = mathException5.getArguments();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        boolean boolean21 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel14.handleStep(stepInterpolator22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.io.IOException iOException16 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException16);
        derivativeException14.addSuppressed((java.lang.Throwable) iOException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray5, (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray5);
        java.lang.Class<?> wildcardClass21 = mathException20.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException18);
        derivativeException16.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray30);
        iOException18.addSuppressed((java.lang.Throwable) derivativeException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException18);
        java.io.IOException iOException36 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException35);
        java.io.IOException iOException37 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException36);
        iOException2.addSuppressed((java.lang.Throwable) iOException37);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        double double9 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getInitialTime();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double2 = continuousOutputModel1.getFinalTime();
        double double3 = continuousOutputModel1.getInitialTime();
        boolean boolean4 = continuousOutputModel1.requiresDenseOutput();
        double double5 = continuousOutputModel1.getInitialTime();
        java.io.IOException iOException8 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        java.lang.Object[] objArray20 = new java.lang.Object[] { double5, mathException10, iOException13, false, continuousOutputModel17 };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        java.io.IOException iOException34 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException34);
        java.lang.Object[] objArray37 = mathException36.getArguments();
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray29, (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray20, (java.lang.Throwable) mathException39);
        java.lang.String str41 = mathException40.getPattern();
        java.lang.Throwable[] throwableArray42 = mathException40.getSuppressed();
        java.lang.String str43 = mathException40.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str41, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str43, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.setInterpolatedTime((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        double double13 = continuousOutputModel8.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = continuousOutputModel8.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel10.append(continuousOutputModel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Class<?> wildcardClass7 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        double double12 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.setInterpolatedTime((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass6 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel4.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.reset();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        double double24 = continuousOutputModel22.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel22);
        continuousOutputModel4.append(continuousOutputModel22);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.setInterpolatedTime((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray12);
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException23);
        java.lang.Throwable throwable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException24.addSuppressed(throwable25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean13 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel4);
        double double16 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        java.lang.Class<?> wildcardClass4 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) mathException17);
        java.lang.String str19 = mathException17.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str19, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean16 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel11);
        continuousOutputModel5.append(continuousOutputModel7);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean24 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel19);
        continuousOutputModel0.append(continuousOutputModel19);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.handleStep(stepInterpolator27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double8 = continuousOutputModel7.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel7);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) mathException6);
        java.lang.String str8 = mathException6.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException6);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray20);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException24);
        mathException6.addSuppressed((java.lang.Throwable) iOException24);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        continuousOutputModel14.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel14.handleStep(stepInterpolator22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException15);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray18);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        double double26 = continuousOutputModel22.getInitialTime();
        java.io.IOException iOException29 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException29);
        java.io.IOException iOException34 = new java.io.IOException("hi!");
        java.io.IOException iOException35 = new java.io.IOException("", (java.lang.Throwable) iOException34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double39 = continuousOutputModel38.getFinalTime();
        double double40 = continuousOutputModel38.getInitialTime();
        java.lang.Object[] objArray41 = new java.lang.Object[] { double26, mathException31, iOException34, false, continuousOutputModel38 };
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray50);
        java.io.IOException iOException55 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException55);
        java.lang.Object[] objArray58 = mathException57.getArguments();
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray50, (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray41, (java.lang.Throwable) mathException60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18, (java.lang.Throwable) mathException61);
        derivativeException9.addSuppressed((java.lang.Throwable) mathException61);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("", strArray77);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray77);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray77);
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException("", strArray77);
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray77);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray77);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException83);
        java.lang.String str85 = derivativeException83.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str85, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass11 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str3, "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", objArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException3);
        java.lang.String str6 = mathException3.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.lang.Object[] objArray1 = null;
        java.io.IOException iOException2 = new java.io.IOException();
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.io.IOException iOException9 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Object[] objArray11 = derivativeException10.getArguments();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        java.io.IOException iOException22 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        derivativeException20.addSuppressed((java.lang.Throwable) iOException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray11, (java.lang.Throwable) derivativeException20);
        java.io.IOException iOException28 = new java.io.IOException("hi!");
        java.io.IOException iOException29 = new java.io.IOException("", (java.lang.Throwable) iOException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException29);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray11, (java.lang.Throwable) iOException29);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) mathException32);
        iOException5.addSuppressed((java.lang.Throwable) mathException32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", objArray1, (java.lang.Throwable) iOException5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) mathException6);
        java.lang.String str8 = mathException6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str8, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel14.handleStep(stepInterpolator21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException(throwable1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: hi!", throwable1);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str6 = mathException5.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        mathException3.addSuppressed((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ");
        mathException5.addSuppressed((java.lang.Throwable) mathException10);
        java.lang.String str12 = mathException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str12, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException3);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException5);
        java.lang.String str8 = mathException5.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str8, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException4);
        java.lang.Object[] objArray7 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException12);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: hi!", objArray7, (java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray17 = mathException15.getSuppressed();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean21 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel17);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.setInterpolatedTime((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean13 = continuousOutputModel6.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = continuousOutputModel6.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        boolean boolean21 = continuousOutputModel0.requiresDenseOutput();
        double double22 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.append(continuousOutputModel23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray12);
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) iOException21);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException27);
        java.lang.Class<?> wildcardClass30 = mathException27.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.io.IOException iOException3 = new java.io.IOException();
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray4);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray17);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray17, (java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray4);
        java.lang.String str30 = mathException29.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str30, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel20);
        double double24 = continuousOutputModel16.getInitialTime();
        double double25 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        continuousOutputModel26.reset();
        double double30 = continuousOutputModel26.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel26);
        continuousOutputModel0.append(continuousOutputModel16);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException2);
        java.lang.String str5 = mathException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str5, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        continuousOutputModel14.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel22.reset();
        double double27 = continuousOutputModel22.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double29 = continuousOutputModel28.getFinalTime();
        double double30 = continuousOutputModel28.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel28);
        continuousOutputModel14.append(continuousOutputModel22);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel14.handleStep(stepInterpolator33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass4 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        java.io.IOException iOException14 = new java.io.IOException("hi!");
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("hi!", (java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", (java.lang.Object[]) strArray8, (java.lang.Throwable) iOException17);
        java.io.IOException iOException27 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException27);
        java.lang.Object[] objArray30 = mathException29.getArguments();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray30);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double35 = continuousOutputModel34.getFinalTime();
        double double36 = continuousOutputModel34.getInitialTime();
        boolean boolean37 = continuousOutputModel34.requiresDenseOutput();
        double double38 = continuousOutputModel34.getInitialTime();
        java.io.IOException iOException41 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException41);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        java.io.IOException iOException47 = new java.io.IOException("", (java.lang.Throwable) iOException46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double51 = continuousOutputModel50.getFinalTime();
        double double52 = continuousOutputModel50.getInitialTime();
        java.lang.Object[] objArray53 = new java.lang.Object[] { double38, mathException43, iOException46, false, continuousOutputModel50 };
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("", strArray62);
        java.io.IOException iOException67 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException67);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException67);
        java.lang.Object[] objArray70 = mathException69.getArguments();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray62, (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray53, (java.lang.Throwable) mathException72);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray30, (java.lang.Throwable) mathException73);
        java.io.IOException iOException77 = new java.io.IOException("hi!");
        java.io.IOException iOException78 = new java.io.IOException("", (java.lang.Throwable) iOException77);
        java.io.IOException iOException79 = new java.io.IOException((java.lang.Throwable) iOException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray30, (java.lang.Throwable) iOException79);
        mathException20.addSuppressed((java.lang.Throwable) iOException79);
        java.lang.String str82 = mathException20.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: " + "'", str82, "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        java.io.IOException iOException21 = new java.io.IOException("", (java.lang.Throwable) iOException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        java.io.IOException iOException23 = new java.io.IOException("hi!", (java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.String str28 = mathException27.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException27);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.Class<?> wildcardClass31 = derivativeException30.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.MathException: " + "'", str28, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException" + "'", str2, "org.apache.commons.math.MathException: java.io.IOException");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException13);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) mathException15);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.lang.Class<?> wildcardClass21 = throwableArray20.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel3);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        continuousOutputModel4.append(continuousOutputModel8);
        double double12 = continuousOutputModel4.getInitialTime();
        double double13 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double15 = continuousOutputModel4.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel6);
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel6.setInterpolatedTime((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        double double14 = continuousOutputModel10.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel10);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        double double20 = continuousOutputModel18.getInitialTime();
        boolean boolean21 = continuousOutputModel18.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel22.reset();
        boolean boolean27 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel18.append(continuousOutputModel22);
        continuousOutputModel16.append(continuousOutputModel18);
        continuousOutputModel0.append(continuousOutputModel18);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel16.append(continuousOutputModel20);
        continuousOutputModel5.append(continuousOutputModel16);
        boolean boolean25 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel16.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel16.handleStep(stepInterpolator27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getInitialTime();
        double double14 = continuousOutputModel5.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.io.IOException iOException7 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException7);
        java.lang.Object[] objArray10 = mathException9.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray10);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double15 = continuousOutputModel14.getFinalTime();
        double double16 = continuousOutputModel14.getInitialTime();
        boolean boolean17 = continuousOutputModel14.requiresDenseOutput();
        double double18 = continuousOutputModel14.getInitialTime();
        java.io.IOException iOException21 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException21);
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) iOException26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double31 = continuousOutputModel30.getFinalTime();
        double double32 = continuousOutputModel30.getInitialTime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { double18, mathException23, iOException26, false, continuousOutputModel30 };
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray42);
        java.io.IOException iOException47 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException47);
        java.lang.Object[] objArray50 = mathException49.getArguments();
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException49);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray42, (java.lang.Throwable) mathException49);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray33, (java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray10, (java.lang.Throwable) mathException53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", objArray10);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException("", strArray64);
        java.io.IOException iOException69 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException69);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException69);
        java.lang.Object[] objArray72 = mathException71.getArguments();
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException71);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray64, (java.lang.Throwable) mathException71);
        java.lang.String str75 = mathException74.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException74);
        mathException55.addSuppressed((java.lang.Throwable) derivativeException76);
        java.io.IOException iOException78 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException76);
        java.io.IOException iOException79 = new java.io.IOException((java.lang.Throwable) derivativeException76);
        java.lang.String str80 = iOException79.toString();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str75, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!" + "'", str80, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        java.io.IOException iOException14 = new java.io.IOException("hi!");
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("hi!", (java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", (java.lang.Object[]) strArray8, (java.lang.Throwable) iOException17);
        java.io.IOException iOException27 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException27);
        java.lang.Object[] objArray30 = mathException29.getArguments();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray30);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double35 = continuousOutputModel34.getFinalTime();
        double double36 = continuousOutputModel34.getInitialTime();
        boolean boolean37 = continuousOutputModel34.requiresDenseOutput();
        double double38 = continuousOutputModel34.getInitialTime();
        java.io.IOException iOException41 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException41);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        java.io.IOException iOException47 = new java.io.IOException("", (java.lang.Throwable) iOException46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double51 = continuousOutputModel50.getFinalTime();
        double double52 = continuousOutputModel50.getInitialTime();
        java.lang.Object[] objArray53 = new java.lang.Object[] { double38, mathException43, iOException46, false, continuousOutputModel50 };
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("", strArray62);
        java.io.IOException iOException67 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException67);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException67);
        java.lang.Object[] objArray70 = mathException69.getArguments();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray62, (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray53, (java.lang.Throwable) mathException72);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray30, (java.lang.Throwable) mathException73);
        java.io.IOException iOException77 = new java.io.IOException("hi!");
        java.io.IOException iOException78 = new java.io.IOException("", (java.lang.Throwable) iOException77);
        java.io.IOException iOException79 = new java.io.IOException((java.lang.Throwable) iOException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray30, (java.lang.Throwable) iOException79);
        mathException20.addSuppressed((java.lang.Throwable) iOException79);
        java.lang.Object[] objArray82 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.String str84 = mathException83.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: " + "'", str84, "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.lang.String str9 = derivativeException8.getPattern();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.lang.String str12 = iOException10.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: " + "'", str9, "java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str12, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean13 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        double double19 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel20.reset();
        boolean boolean24 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double26 = continuousOutputModel25.getFinalTime();
        double double27 = continuousOutputModel25.getInitialTime();
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel25);
        continuousOutputModel15.append(continuousOutputModel20);
        continuousOutputModel6.append(continuousOutputModel15);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel15.handleStep(stepInterpolator32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        continuousOutputModel14.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel22.reset();
        double double27 = continuousOutputModel22.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double29 = continuousOutputModel28.getFinalTime();
        double double30 = continuousOutputModel28.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel28);
        continuousOutputModel14.append(continuousOutputModel22);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = continuousOutputModel22.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        double double7 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str7, "java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel9);
        continuousOutputModel0.append(continuousOutputModel9);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = continuousOutputModel9.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel16.append(continuousOutputModel20);
        continuousOutputModel5.append(continuousOutputModel16);
        double double25 = continuousOutputModel16.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = continuousOutputModel16.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        double double16 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        double double12 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.reset();
        continuousOutputModel15.reset();
        continuousOutputModel5.append(continuousOutputModel15);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean21 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.lang.Throwable throwable12 = null;
        java.io.IOException iOException13 = new java.io.IOException(throwable12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException14);
        java.lang.String str16 = mathException14.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str16, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException2);
        java.lang.String str4 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str4, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getFinalTime();
        boolean boolean10 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel6);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel6.handleStep(stepInterpolator12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray12);
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        mathException24.addSuppressed((java.lang.Throwable) iOException26);
        mathException22.addSuppressed((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException33);
        java.lang.String str35 = mathException34.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.math.MathException: " + "'", str35, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException8);
        java.lang.Object[] objArray11 = mathException10.getArguments();
        mathException5.addSuppressed((java.lang.Throwable) mathException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        java.lang.String str14 = mathException5.getPattern();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str14, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.io.IOException iOException7 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException7);
        java.lang.Object[] objArray10 = mathException9.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray10);
        java.lang.String str14 = mathException13.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException();
        mathException13.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) iOException17);
        java.lang.String str19 = mathException18.toString();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.MathException: " + "'", str14, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str19, "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.MathException: java.io.IOException");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray7, (java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean26 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel21);
        continuousOutputModel17.reset();
        continuousOutputModel9.append(continuousOutputModel17);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = continuousOutputModel17.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean16 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double11 = continuousOutputModel4.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double2 = continuousOutputModel1.getFinalTime();
        double double3 = continuousOutputModel1.getInitialTime();
        boolean boolean4 = continuousOutputModel1.requiresDenseOutput();
        double double5 = continuousOutputModel1.getInitialTime();
        java.io.IOException iOException8 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        java.lang.Object[] objArray20 = new java.lang.Object[] { double5, mathException10, iOException13, false, continuousOutputModel17 };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        java.io.IOException iOException34 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException34);
        java.lang.Object[] objArray37 = mathException36.getArguments();
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray29, (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray20, (java.lang.Throwable) mathException39);
        java.lang.String str41 = mathException39.getPattern();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str41, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.MathException: hi!", throwable1);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean13 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        double double19 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel20.reset();
        boolean boolean24 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double26 = continuousOutputModel25.getFinalTime();
        double double27 = continuousOutputModel25.getInitialTime();
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel25);
        continuousOutputModel15.append(continuousOutputModel20);
        continuousOutputModel6.append(continuousOutputModel15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = continuousOutputModel15.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.String str17 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        java.lang.Object[] objArray2 = mathException1.getArguments();
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException6);
        mathException1.addSuppressed((java.lang.Throwable) mathException7);
        java.lang.String str9 = mathException7.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str9, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray10);
        java.lang.String str15 = derivativeException14.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.String str17 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: hi!" + "'", str15, "java.io.IOException: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str17, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        double double14 = continuousOutputModel10.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel10);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        double double20 = continuousOutputModel18.getInitialTime();
        boolean boolean21 = continuousOutputModel18.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel22.reset();
        boolean boolean27 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel18.append(continuousOutputModel22);
        continuousOutputModel16.append(continuousOutputModel18);
        continuousOutputModel0.append(continuousOutputModel18);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = continuousOutputModel18.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException13);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) mathException15);
        java.lang.String str19 = mathException18.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) derivativeException20);
        java.lang.String str22 = iOException21.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str19, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!" + "'", str22, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double20 = continuousOutputModel19.getFinalTime();
        double double21 = continuousOutputModel19.getInitialTime();
        boolean boolean22 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel14.append(continuousOutputModel19);
        boolean boolean24 = continuousOutputModel19.requiresDenseOutput();
        double double25 = continuousOutputModel19.getFinalTime();
        continuousOutputModel19.reset();
        double double27 = continuousOutputModel19.getInitialTime();
        boolean boolean28 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = continuousOutputModel5.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str2, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel7.requiresDenseOutput();
        double double10 = continuousOutputModel7.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel11);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        continuousOutputModel0.append(continuousOutputModel7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        boolean boolean21 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean16 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel12.append(continuousOutputModel17);
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        double double23 = continuousOutputModel17.getFinalTime();
        continuousOutputModel17.reset();
        continuousOutputModel5.append(continuousOutputModel17);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel17.setInterpolatedTime((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel6);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = continuousOutputModel6.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        boolean boolean14 = continuousOutputModel10.requiresDenseOutput();
        double double15 = continuousOutputModel10.getFinalTime();
        boolean boolean16 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel10);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        derivativeException9.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray23);
        iOException11.addSuppressed((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException11);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException29);
        java.lang.String str32 = mathException31.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str32, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        java.io.IOException iOException14 = new java.io.IOException("hi!");
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("hi!", (java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", (java.lang.Object[]) strArray8, (java.lang.Throwable) iOException17);
        java.io.IOException iOException27 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException27);
        java.lang.Object[] objArray30 = mathException29.getArguments();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray30);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double35 = continuousOutputModel34.getFinalTime();
        double double36 = continuousOutputModel34.getInitialTime();
        boolean boolean37 = continuousOutputModel34.requiresDenseOutput();
        double double38 = continuousOutputModel34.getInitialTime();
        java.io.IOException iOException41 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException41);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        java.io.IOException iOException47 = new java.io.IOException("", (java.lang.Throwable) iOException46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double51 = continuousOutputModel50.getFinalTime();
        double double52 = continuousOutputModel50.getInitialTime();
        java.lang.Object[] objArray53 = new java.lang.Object[] { double38, mathException43, iOException46, false, continuousOutputModel50 };
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("", strArray62);
        java.io.IOException iOException67 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException67);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException67);
        java.lang.Object[] objArray70 = mathException69.getArguments();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray62, (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray53, (java.lang.Throwable) mathException72);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray30, (java.lang.Throwable) mathException73);
        java.io.IOException iOException77 = new java.io.IOException("hi!");
        java.io.IOException iOException78 = new java.io.IOException("", (java.lang.Throwable) iOException77);
        java.io.IOException iOException79 = new java.io.IOException((java.lang.Throwable) iOException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray30, (java.lang.Throwable) iOException79);
        mathException20.addSuppressed((java.lang.Throwable) iOException79);
        java.lang.Object[] objArray82 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.String str84 = mathException83.getPattern();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: org.apache.commons.math.MathException: , org.apache.commons.math.ode.DerivativeException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str84, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel7.requiresDenseOutput();
        double double10 = continuousOutputModel7.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel11);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        continuousOutputModel0.append(continuousOutputModel7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel7.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException1);
        java.lang.String str3 = mathException2.getPattern();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str3, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        continuousOutputModel4.append(continuousOutputModel8);
        double double12 = continuousOutputModel4.getInitialTime();
        double double13 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        double double9 = continuousOutputModel0.getFinalTime();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean13 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel4);
        double double16 = continuousOutputModel4.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        continuousOutputModel4.append(continuousOutputModel17);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel17.setInterpolatedTime((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Object[] objArray4 = derivativeException3.getArguments();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        derivativeException13.addSuppressed((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray4, (java.lang.Throwable) derivativeException13);
        java.io.IOException iOException22 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException22);
        java.lang.Object[] objArray25 = mathException24.getArguments();
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray25);
        mathException18.addSuppressed((java.lang.Throwable) mathException26);
        java.lang.String str28 = mathException26.getPattern();
        java.lang.String str29 = mathException26.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.MathException: " + "'", str28, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str29, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double8 = continuousOutputModel7.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }
}

