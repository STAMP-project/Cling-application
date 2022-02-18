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
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.String str2 = derivativeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str2, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: " + "'", str2, "java.io.IOException: ");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
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
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
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
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.lang.String str7 = derivativeException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
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
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = iOException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        double double9 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.String str7 = derivativeException6.getPattern();
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        java.lang.String str9 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.lang.String str6 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: hi!" + "'", str6, "java.io.IOException: hi!");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.append(continuousOutputModel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
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
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Class<?> wildcardClass6 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, true);
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
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException2);
        java.lang.String str5 = derivativeException2.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str5, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String str10 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        double double9 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
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
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException2);
        java.lang.Object[] objArray5 = derivativeException2.getArguments();
        java.lang.Class<?> wildcardClass6 = derivativeException2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.String str2 = derivativeException1.getPattern();
        java.lang.String str3 = derivativeException1.getPattern();
        java.lang.String str4 = derivativeException1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str4, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel2.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        double double16 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException6.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[java.io.IOException, hi!, , ]");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        double double9 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.io.IOException iOException9 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("", (java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        derivativeException6.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String str14 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: " + "'", str14, "java.io.IOException: ");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.Object[] objArray2 = derivativeException1.getArguments();
        java.lang.Object[] objArray3 = derivativeException1.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException1);
        java.lang.String str5 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str5, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.setInterpolatedTime((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.String str17 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str17, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
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
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        double double9 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass7 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        java.lang.Class<?> wildcardClass7 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException20);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.String str24 = derivativeException23.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str24, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("hi!", (java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: hi!" + "'", str3, "java.io.IOException: hi!");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String str8 = derivativeException7.getPattern();
        java.lang.String str9 = derivativeException7.getPattern();
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass11 = iOException10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.String str7 = derivativeException6.getPattern();
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        java.io.IOException iOException9 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.String str11 = derivativeException10.getPattern();
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        derivativeException10.addSuppressed((java.lang.Throwable) iOException13);
        derivativeException6.addSuppressed((java.lang.Throwable) iOException13);
        java.lang.String str16 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: hi!" + "'", str16, "java.io.IOException: hi!");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel2.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = continuousOutputModel2.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        double double10 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        double double10 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        double double10 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel11);
        continuousOutputModel5.reset();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel2.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = continuousOutputModel2.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        java.lang.Class<?> wildcardClass5 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel3.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str9 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        double double18 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        double double20 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getInitialTime();
        continuousOutputModel15.append(continuousOutputModel21);
        continuousOutputModel15.reset();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel0.append(continuousOutputModel15);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
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
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String str13 = derivativeException12.getPattern();
        java.lang.String str14 = derivativeException12.getPattern();
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException12);
        derivativeException4.addSuppressed((java.lang.Throwable) iOException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray18 = iOException15.getSuppressed();
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException15);
        java.lang.String str20 = iOException19.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str20, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        double double16 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.Object[] objArray2 = derivativeException1.getArguments();
        java.lang.Object[] objArray3 = derivativeException1.getArguments();
        java.lang.Object[] objArray4 = derivativeException1.getArguments();
        java.lang.Class<?> wildcardClass5 = derivativeException1.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.lang.String str7 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str7, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel2.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = continuousOutputModel2.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.String str2 = derivativeException1.getPattern();
        java.lang.String str3 = derivativeException1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str3, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean16 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        double double19 = continuousOutputModel9.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getInitialTime();
        continuousOutputModel23.reset();
        double double28 = continuousOutputModel23.getInitialTime();
        continuousOutputModel21.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        double double32 = continuousOutputModel30.getInitialTime();
        double double33 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        double double35 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        boolean boolean37 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean39 = continuousOutputModel30.requiresDenseOutput();
        double double40 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel2.append(continuousOutputModel30);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel30.handleStep(stepInterpolator43, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass6 = iOException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        java.lang.Class<?> wildcardClass5 = continuousOutputModel2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        double double10 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getFinalTime();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException2);
        java.lang.Class<?> wildcardClass6 = iOException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        java.lang.Class<?> wildcardClass9 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.String str7 = derivativeException6.getPattern();
        java.lang.Class<?> wildcardClass8 = derivativeException6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        double double10 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass5 = iOException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = continuousOutputModel2.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        double double10 = continuousOutputModel4.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        double double10 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel11);
        continuousOutputModel5.reset();
        continuousOutputModel0.append(continuousOutputModel5);
        java.lang.Class<?> wildcardClass18 = continuousOutputModel5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double7 = continuousOutputModel0.getFinalTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str4 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str4, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException6);
        java.lang.String str8 = derivativeException6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Throwable[] throwableArray8 = derivativeException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.Class<?> wildcardClass10 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.lang.String str10 = derivativeException9.getPattern();
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException9);
        java.lang.Object[] objArray12 = derivativeException9.getArguments();
        iOException4.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass14 = iOException4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel2.reset();
        boolean boolean6 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass5 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException7);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: hi!" + "'", str9, "java.io.IOException: hi!");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
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
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getFinalTime();
        java.lang.Class<?> wildcardClass6 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str2, "java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        double double10 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel11);
        continuousOutputModel5.reset();
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        java.lang.String str8 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str8, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        double double5 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double7 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
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
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean7 = continuousOutputModel3.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.setInterpolatedTime((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String str13 = derivativeException12.getPattern();
        java.lang.String str14 = derivativeException12.getPattern();
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException12);
        derivativeException4.addSuppressed((java.lang.Throwable) iOException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray18 = iOException15.getSuppressed();
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException15);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray34 = iOException33.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        derivativeException31.addSuppressed((java.lang.Throwable) derivativeException35);
        iOException15.addSuppressed((java.lang.Throwable) derivativeException31);
        java.lang.Class<?> wildcardClass38 = iOException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        java.lang.Class<?> wildcardClass10 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str9 = derivativeException8.getPattern();
        java.lang.String str10 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String str8 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str8, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        double double18 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        double double20 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getInitialTime();
        continuousOutputModel15.append(continuousOutputModel21);
        continuousOutputModel15.reset();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel0.append(continuousOutputModel15);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean32 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel29.append(continuousOutputModel31);
        continuousOutputModel31.reset();
        continuousOutputModel0.append(continuousOutputModel31);
        boolean boolean36 = continuousOutputModel31.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = continuousOutputModel31.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.String str2 = derivativeException1.getPattern();
        java.lang.String str3 = derivativeException1.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException1);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        java.lang.Class<?> wildcardClass6 = derivativeException4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        double double10 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel11);
        continuousOutputModel5.reset();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.String str2 = derivativeException1.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        derivativeException1.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.String str6 = derivativeException1.getPattern();
        java.lang.String str7 = derivativeException1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str7, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
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
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException1);
        java.lang.Object[] objArray3 = derivativeException1.getArguments();
        java.lang.String str4 = derivativeException1.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str4, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getFinalTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str3, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.String str6 = iOException4.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str6, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double9 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.lang.String str7 = derivativeException5.getPattern();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.Class<?> wildcardClass9 = derivativeException5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        boolean boolean13 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getInitialTime();
        continuousOutputModel16.reset();
        double double21 = continuousOutputModel16.getInitialTime();
        continuousOutputModel14.append(continuousOutputModel16);
        boolean boolean23 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel9);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = continuousOutputModel9.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
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
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        double double21 = continuousOutputModel19.getInitialTime();
        double double22 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        double double24 = continuousOutputModel19.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel19);
        boolean boolean26 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = continuousOutputModel19.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        double double21 = continuousOutputModel19.getInitialTime();
        double double22 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        double double24 = continuousOutputModel19.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel19);
        boolean boolean26 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel19);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.handleStep(stepInterpolator29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass4 = iOException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        continuousOutputModel2.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.setInterpolatedTime((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getInitialTime();
        continuousOutputModel4.reset();
        double double9 = continuousOutputModel4.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.String str10 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel7.handleStep(stepInterpolator18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("", (java.lang.Throwable) iOException9);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException27);
        iOException11.addSuppressed((java.lang.Throwable) derivativeException19);
        iOException4.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String str31 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.io.IOException: " + "'", str31, "java.io.IOException: ");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        double double10 = continuousOutputModel4.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean7 = continuousOutputModel3.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.setInterpolatedTime((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.Class<?> wildcardClass12 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.lang.String str7 = derivativeException5.getPattern();
        java.lang.String str8 = derivativeException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel2.reset();
        boolean boolean6 = continuousOutputModel2.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel2.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean16 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        double double19 = continuousOutputModel9.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel9);
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean7 = continuousOutputModel3.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.handleStep(stepInterpolator8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException7);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        derivativeException7.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Class<?> wildcardClass12 = iOException10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        double double9 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel3.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str9 = derivativeException7.getPattern();
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.String str11 = derivativeException7.getPattern();
        java.lang.String str12 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str12, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getFinalTime();
        continuousOutputModel11.reset();
        double double16 = continuousOutputModel11.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel11);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        double double20 = continuousOutputModel18.getInitialTime();
        double double21 = continuousOutputModel18.getInitialTime();
        continuousOutputModel18.reset();
        double double23 = continuousOutputModel18.getInitialTime();
        continuousOutputModel18.reset();
        boolean boolean25 = continuousOutputModel18.requiresDenseOutput();
        double double26 = continuousOutputModel18.getFinalTime();
        boolean boolean27 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel18.reset();
        boolean boolean29 = continuousOutputModel18.requiresDenseOutput();
        double double30 = continuousOutputModel18.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel18);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str5, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.io.IOException iOException10 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException16 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException15);
        java.lang.Class<?> wildcardClass17 = iOException16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("", (java.lang.Throwable) iOException20);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException38);
        iOException22.addSuppressed((java.lang.Throwable) derivativeException30);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.io.IOException iOException42 = new java.io.IOException((java.lang.Throwable) derivativeException41);
        java.io.IOException iOException43 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException41);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException41);
        java.lang.String[] strArray50 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray50);
        java.io.IOException iOException54 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException54);
        java.io.IOException iOException56 = new java.io.IOException("", (java.lang.Throwable) iOException54);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException56);
        derivativeException51.addSuppressed((java.lang.Throwable) iOException56);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException51);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException51);
        java.lang.Object[] objArray61 = derivativeException7.getArguments();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[, , hi!, java.io.IOException, java.io.IOException]");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("hi!", (java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException" + "'", str3, "java.io.IOException");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        continuousOutputModel4.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("", (java.lang.Throwable) iOException20);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException38);
        iOException22.addSuppressed((java.lang.Throwable) derivativeException30);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.io.IOException iOException42 = new java.io.IOException((java.lang.Throwable) derivativeException41);
        java.io.IOException iOException43 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException41);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException41);
        java.lang.String str45 = derivativeException7.getPattern();
        java.lang.String str46 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str46, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.String str6 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str6, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getInitialTime();
        continuousOutputModel4.reset();
        double double9 = continuousOutputModel4.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel13);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = continuousOutputModel13.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.String str14 = derivativeException13.getPattern();
        java.lang.String str15 = derivativeException13.getPattern();
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException13);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException16);
        java.lang.Throwable[] throwableArray19 = iOException16.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException16);
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException16);
        java.lang.String str22 = iOException16.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str22, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException2);
        java.lang.Class<?> wildcardClass5 = derivativeException2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        double double13 = continuousOutputModel10.getFinalTime();
        continuousOutputModel10.reset();
        continuousOutputModel7.append(continuousOutputModel10);
        boolean boolean16 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        continuousOutputModel0.append(continuousOutputModel7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel9);
        continuousOutputModel7.reset();
        double double13 = continuousOutputModel7.getFinalTime();
        continuousOutputModel7.reset();
        continuousOutputModel0.append(continuousOutputModel7);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel7.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        double double10 = continuousOutputModel4.getFinalTime();
        continuousOutputModel4.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        double double5 = continuousOutputModel0.getInitialTime();
        double double6 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getFinalTime();
        continuousOutputModel11.reset();
        double double16 = continuousOutputModel11.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        double double21 = continuousOutputModel19.getInitialTime();
        double double22 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        double double24 = continuousOutputModel19.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel19);
        boolean boolean26 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel19);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException7);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        derivativeException7.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException27);
        java.lang.Object[] objArray29 = derivativeException27.getArguments();
        iOException10.addSuppressed((java.lang.Throwable) derivativeException27);
        java.lang.Class<?> wildcardClass31 = derivativeException27.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException20);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray24 = derivativeException23.getSuppressed();
        java.lang.String str25 = derivativeException23.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str25, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel2.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel2.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.io.IOException iOException13 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        iOException3.addSuppressed((java.lang.Throwable) iOException13);
        java.lang.String str16 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: hi!" + "'", str16, "java.io.IOException: hi!");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Throwable[] throwableArray8 = derivativeException7.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass10 = iOException9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        double double16 = continuousOutputModel14.getInitialTime();
        double double17 = continuousOutputModel14.getInitialTime();
        continuousOutputModel14.reset();
        double double19 = continuousOutputModel14.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel14);
        double double21 = continuousOutputModel12.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel2.append(continuousOutputModel12);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException3);
        java.lang.String str5 = derivativeException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str5, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.String str14 = derivativeException13.getPattern();
        java.lang.String str15 = derivativeException13.getPattern();
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException13);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException16);
        java.lang.Throwable[] throwableArray19 = iOException16.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException16);
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException16);
        java.lang.String str22 = iOException21.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str22, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException", strArray7);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        java.lang.Object[] objArray21 = derivativeException20.getArguments();
        java.io.IOException iOException22 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Class<?> wildcardClass25 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, , hi!, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, , hi!, ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Object[] objArray10 = derivativeException9.getArguments();
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException9);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, , hi!, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, , hi!, ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str12, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.String str11 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException" + "'", str11, "org.apache.commons.math.ode.DerivativeException: java.io.IOException");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        continuousOutputModel7.append(continuousOutputModel10);
        continuousOutputModel3.append(continuousOutputModel10);
        double double15 = continuousOutputModel3.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.handleStep(stepInterpolator16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        boolean boolean10 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean16 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        double double19 = continuousOutputModel9.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getInitialTime();
        continuousOutputModel23.reset();
        double double28 = continuousOutputModel23.getInitialTime();
        continuousOutputModel21.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        double double32 = continuousOutputModel30.getInitialTime();
        double double33 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        double double35 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        boolean boolean37 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean39 = continuousOutputModel30.requiresDenseOutput();
        double double40 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel2.append(continuousOutputModel30);
        continuousOutputModel2.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double44 = continuousOutputModel2.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray6);
        java.lang.Throwable[] throwableArray9 = derivativeException8.getSuppressed();
        java.lang.Class<?> wildcardClass10 = throwableArray9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getFinalTime();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        java.lang.Class<?> wildcardClass6 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean16 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        double double19 = continuousOutputModel9.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel9);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.setInterpolatedTime((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        double double16 = continuousOutputModel14.getInitialTime();
        double double17 = continuousOutputModel14.getInitialTime();
        continuousOutputModel14.reset();
        double double19 = continuousOutputModel14.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel14);
        double double21 = continuousOutputModel12.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel2.append(continuousOutputModel12);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel12.setInterpolatedTime((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.String str2 = derivativeException1.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        derivativeException1.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        derivativeException1.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Class<?> wildcardClass11 = iOException7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        double double7 = continuousOutputModel3.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.handleStep(stepInterpolator8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Throwable[] throwableArray8 = derivativeException7.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String str14 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str14, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException" + "'", str3, "java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        double double16 = continuousOutputModel7.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = continuousOutputModel7.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getFinalTime();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel2.reset();
        continuousOutputModel0.append(continuousOutputModel2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        double double16 = continuousOutputModel14.getInitialTime();
        double double17 = continuousOutputModel14.getInitialTime();
        continuousOutputModel14.reset();
        double double19 = continuousOutputModel14.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel14);
        double double21 = continuousOutputModel12.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel2.append(continuousOutputModel12);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.setInterpolatedTime((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException3 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String str5 = derivativeException4.getPattern();
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.String str8 = iOException6.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str8, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getFinalTime();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel2.reset();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getFinalTime();
        continuousOutputModel12.reset();
        continuousOutputModel9.append(continuousOutputModel12);
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        double double21 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException20 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("", (java.lang.Throwable) iOException20);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException38);
        iOException22.addSuppressed((java.lang.Throwable) derivativeException30);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.io.IOException iOException42 = new java.io.IOException((java.lang.Throwable) derivativeException41);
        java.io.IOException iOException43 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException41);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException41);
        java.lang.String str45 = derivativeException7.getPattern();
        java.io.IOException iOException46 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String str47 = iOException46.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str47, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException6);
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        java.lang.Throwable[] throwableArray9 = derivativeException6.getSuppressed();
        java.lang.String str10 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        boolean boolean12 = continuousOutputModel2.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = continuousOutputModel2.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        continuousOutputModel7.append(continuousOutputModel10);
        continuousOutputModel3.append(continuousOutputModel10);
        double double15 = continuousOutputModel3.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel3.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("hi!", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.String[] strArray14 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        java.lang.String str16 = derivativeException15.getPattern();
        java.lang.String str17 = derivativeException15.getPattern();
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException15);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException18);
        iOException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray21 = derivativeException7.getSuppressed();
        java.lang.Class<?> wildcardClass22 = throwableArray21.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String str8 = derivativeException7.getPattern();
        java.lang.String str9 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        double double16 = continuousOutputModel14.getInitialTime();
        double double17 = continuousOutputModel14.getInitialTime();
        continuousOutputModel14.reset();
        double double19 = continuousOutputModel14.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel14);
        double double21 = continuousOutputModel12.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel2.append(continuousOutputModel12);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = continuousOutputModel2.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        java.lang.Class<?> wildcardClass8 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        double double18 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        double double27 = continuousOutputModel25.getInitialTime();
        double double28 = continuousOutputModel25.getFinalTime();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel21.reset();
        continuousOutputModel19.append(continuousOutputModel21);
        continuousOutputModel0.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = continuousOutputModel19.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException20);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        java.io.IOException iOException32 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException31);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException31);
        java.lang.Object[] objArray34 = derivativeException31.getArguments();
        java.io.IOException iOException37 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException37);
        java.io.IOException iOException39 = new java.io.IOException("", (java.lang.Throwable) iOException37);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        derivativeException47.addSuppressed((java.lang.Throwable) derivativeException55);
        iOException39.addSuppressed((java.lang.Throwable) derivativeException47);
        derivativeException31.addSuppressed((java.lang.Throwable) iOException39);
        java.io.IOException iOException61 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException62 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException61);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException62);
        derivativeException31.addSuppressed((java.lang.Throwable) derivativeException63);
        java.lang.Class<?> wildcardClass65 = derivativeException31.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        double double17 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        boolean boolean19 = continuousOutputModel12.requiresDenseOutput();
        double double20 = continuousOutputModel12.getFinalTime();
        boolean boolean21 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getFinalTime();
        continuousOutputModel23.reset();
        double double28 = continuousOutputModel23.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        double double32 = continuousOutputModel30.getInitialTime();
        double double33 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        double double35 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        boolean boolean37 = continuousOutputModel30.requiresDenseOutput();
        double double38 = continuousOutputModel30.getFinalTime();
        boolean boolean39 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean41 = continuousOutputModel30.requiresDenseOutput();
        double double42 = continuousOutputModel30.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel30);
        continuousOutputModel0.append(continuousOutputModel30);
        double double45 = continuousOutputModel30.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel30.setInterpolatedTime((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getInitialTime();
        continuousOutputModel4.reset();
        double double9 = continuousOutputModel4.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel13);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        double double18 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        double double27 = continuousOutputModel25.getInitialTime();
        double double28 = continuousOutputModel25.getFinalTime();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel21.reset();
        continuousOutputModel19.append(continuousOutputModel21);
        continuousOutputModel0.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.setInterpolatedTime((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        continuousOutputModel11.reset();
        boolean boolean15 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        continuousOutputModel0.append(continuousOutputModel11);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel11.handleStep(stepInterpolator18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getFinalTime();
        continuousOutputModel12.reset();
        continuousOutputModel9.append(continuousOutputModel12);
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = continuousOutputModel9.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        double double17 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        boolean boolean19 = continuousOutputModel12.requiresDenseOutput();
        double double20 = continuousOutputModel12.getFinalTime();
        boolean boolean21 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getFinalTime();
        continuousOutputModel23.reset();
        double double28 = continuousOutputModel23.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        double double32 = continuousOutputModel30.getInitialTime();
        double double33 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        double double35 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        boolean boolean37 = continuousOutputModel30.requiresDenseOutput();
        double double38 = continuousOutputModel30.getFinalTime();
        boolean boolean39 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean41 = continuousOutputModel30.requiresDenseOutput();
        double double42 = continuousOutputModel30.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel30);
        continuousOutputModel0.append(continuousOutputModel30);
        // The following exception was thrown during execution in test generation
        try {
            double double45 = continuousOutputModel30.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Throwable[] throwableArray8 = derivativeException7.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        double double10 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass5 = iOException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = continuousOutputModel9.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        continuousOutputModel11.reset();
        continuousOutputModel0.append(continuousOutputModel11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = continuousOutputModel11.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel2.reset();
        boolean boolean6 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        double double21 = continuousOutputModel19.getInitialTime();
        double double22 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        double double24 = continuousOutputModel19.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel19);
        boolean boolean26 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel19);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        continuousOutputModel2.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        java.lang.Class<?> wildcardClass11 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.append(continuousOutputModel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException", strArray7);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.lang.Class<?> wildcardClass12 = iOException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        double double17 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        boolean boolean19 = continuousOutputModel12.requiresDenseOutput();
        double double20 = continuousOutputModel12.getFinalTime();
        boolean boolean21 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getFinalTime();
        continuousOutputModel23.reset();
        double double28 = continuousOutputModel23.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        double double32 = continuousOutputModel30.getInitialTime();
        double double33 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        double double35 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        boolean boolean37 = continuousOutputModel30.requiresDenseOutput();
        double double38 = continuousOutputModel30.getFinalTime();
        boolean boolean39 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean41 = continuousOutputModel30.requiresDenseOutput();
        double double42 = continuousOutputModel30.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel30);
        continuousOutputModel0.append(continuousOutputModel30);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        java.lang.Class<?> wildcardClass5 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Object[] objArray10 = derivativeException9.getArguments();
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        derivativeException9.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.lang.Class<?> wildcardClass19 = iOException18.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel8);
        continuousOutputModel0.append(continuousOutputModel8);
        boolean boolean14 = continuousOutputModel8.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = continuousOutputModel8.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray3);
        java.lang.String str7 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str7, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException16);
        java.lang.String str20 = derivativeException16.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str20, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass12 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        boolean boolean13 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getInitialTime();
        continuousOutputModel16.reset();
        double double21 = continuousOutputModel16.getInitialTime();
        continuousOutputModel14.append(continuousOutputModel16);
        boolean boolean23 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel9);
        java.lang.Class<?> wildcardClass26 = continuousOutputModel9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        double double16 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        double double7 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getFinalTime();
        continuousOutputModel11.reset();
        continuousOutputModel8.append(continuousOutputModel11);
        continuousOutputModel0.append(continuousOutputModel11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = continuousOutputModel11.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.Object[] objArray2 = derivativeException1.getArguments();
        java.lang.Object[] objArray3 = derivativeException1.getArguments();
        java.lang.Object[] objArray4 = derivativeException1.getArguments();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException1);
        java.lang.Object[] objArray6 = derivativeException1.getArguments();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        double double18 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        double double27 = continuousOutputModel25.getInitialTime();
        double double28 = continuousOutputModel25.getFinalTime();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel21.reset();
        continuousOutputModel19.append(continuousOutputModel21);
        continuousOutputModel0.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = continuousOutputModel19.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.String str7 = derivativeException6.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String str9 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        double double10 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel11);
        continuousOutputModel5.reset();
        continuousOutputModel0.append(continuousOutputModel5);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        double double9 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getFinalTime();
        continuousOutputModel11.reset();
        double double16 = continuousOutputModel11.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel11);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        double double20 = continuousOutputModel18.getInitialTime();
        double double21 = continuousOutputModel18.getInitialTime();
        continuousOutputModel18.reset();
        double double23 = continuousOutputModel18.getInitialTime();
        continuousOutputModel18.reset();
        boolean boolean25 = continuousOutputModel18.requiresDenseOutput();
        double double26 = continuousOutputModel18.getFinalTime();
        boolean boolean27 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel18.reset();
        boolean boolean29 = continuousOutputModel18.requiresDenseOutput();
        double double30 = continuousOutputModel18.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel18);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel18.handleStep(stepInterpolator32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException20);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray31);
        java.io.IOException iOException33 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException32);
        java.io.IOException iOException35 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        derivativeException32.addSuppressed((java.lang.Throwable) iOException35);
        java.lang.Throwable[] throwableArray37 = iOException35.getSuppressed();
        iOException24.addSuppressed((java.lang.Throwable) iOException35);
        java.lang.Class<?> wildcardClass39 = iOException35.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        double double18 = continuousOutputModel0.getInitialTime();
        double double19 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getFinalTime();
        continuousOutputModel12.reset();
        continuousOutputModel9.append(continuousOutputModel12);
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        double double21 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getFinalTime();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.append(continuousOutputModel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        double double18 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        double double27 = continuousOutputModel25.getInitialTime();
        double double28 = continuousOutputModel25.getFinalTime();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel21.reset();
        continuousOutputModel19.append(continuousOutputModel21);
        continuousOutputModel0.append(continuousOutputModel19);
        boolean boolean33 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.lang.String str7 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Class<?> wildcardClass11 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.String str7 = derivativeException6.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String str9 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.Object[] objArray2 = derivativeException1.getArguments();
        java.lang.Object[] objArray3 = derivativeException1.getArguments();
        java.lang.Object[] objArray4 = derivativeException1.getArguments();
        java.lang.String str5 = derivativeException1.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str5, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.String str14 = derivativeException13.getPattern();
        java.lang.String str15 = derivativeException13.getPattern();
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException13);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException16);
        java.lang.Throwable[] throwableArray19 = iOException16.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException16);
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException16);
        java.lang.Class<?> wildcardClass22 = iOException21.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException", strArray7);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException" + "'", str12, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean16 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        double double19 = continuousOutputModel9.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getInitialTime();
        continuousOutputModel23.reset();
        double double28 = continuousOutputModel23.getInitialTime();
        continuousOutputModel21.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        double double32 = continuousOutputModel30.getInitialTime();
        double double33 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        double double35 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        boolean boolean37 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean39 = continuousOutputModel30.requiresDenseOutput();
        double double40 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel2.append(continuousOutputModel30);
        // The following exception was thrown during execution in test generation
        try {
            double double43 = continuousOutputModel30.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        java.lang.Class<?> wildcardClass4 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        java.lang.String str12 = derivativeException11.getPattern();
        java.lang.String str13 = derivativeException11.getPattern();
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException11);
        derivativeException3.addSuppressed((java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        java.lang.Class<?> wildcardClass20 = derivativeException19.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str3, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str4, "java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str9 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.String str10 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        java.lang.Class<?> wildcardClass7 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        double double18 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        double double20 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getInitialTime();
        continuousOutputModel15.append(continuousOutputModel21);
        continuousOutputModel15.reset();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel0.append(continuousOutputModel15);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        continuousOutputModel29.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        double double35 = continuousOutputModel32.getFinalTime();
        continuousOutputModel32.reset();
        continuousOutputModel29.append(continuousOutputModel32);
        boolean boolean38 = continuousOutputModel29.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean40 = continuousOutputModel39.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean42 = continuousOutputModel41.requiresDenseOutput();
        continuousOutputModel39.append(continuousOutputModel41);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean45 = continuousOutputModel44.requiresDenseOutput();
        double double46 = continuousOutputModel44.getInitialTime();
        double double47 = continuousOutputModel44.getInitialTime();
        continuousOutputModel44.reset();
        double double49 = continuousOutputModel44.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean51 = continuousOutputModel50.requiresDenseOutput();
        double double52 = continuousOutputModel50.getInitialTime();
        double double53 = continuousOutputModel50.getInitialTime();
        continuousOutputModel44.append(continuousOutputModel50);
        continuousOutputModel44.reset();
        continuousOutputModel39.append(continuousOutputModel44);
        continuousOutputModel29.append(continuousOutputModel44);
        continuousOutputModel15.append(continuousOutputModel44);
        boolean boolean59 = continuousOutputModel44.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel44.handleStep(stepInterpolator60, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel7.handleStep(stepInterpolator16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray5 = derivativeException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass7 = iOException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean7 = continuousOutputModel3.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.setInterpolatedTime((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = iOException4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        double double6 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        double double16 = continuousOutputModel7.getFinalTime();
        continuousOutputModel7.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel7.handleStep(stepInterpolator18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        double double10 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass5 = iOException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        double double10 = continuousOutputModel4.getFinalTime();
        continuousOutputModel4.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getFinalTime();
        continuousOutputModel21.reset();
        continuousOutputModel12.append(continuousOutputModel21);
        continuousOutputModel12.reset();
        continuousOutputModel4.append(continuousOutputModel12);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel12.handleStep(stepInterpolator29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.setInterpolatedTime((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass5 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double10 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getInitialTime();
        continuousOutputModel11.reset();
        double double16 = continuousOutputModel11.getInitialTime();
        continuousOutputModel11.reset();
        boolean boolean18 = continuousOutputModel11.requiresDenseOutput();
        double double19 = continuousOutputModel11.getFinalTime();
        boolean boolean20 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean22 = continuousOutputModel11.requiresDenseOutput();
        double double23 = continuousOutputModel11.getInitialTime();
        double double24 = continuousOutputModel11.getFinalTime();
        double double25 = continuousOutputModel11.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getInitialTime();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.setInterpolatedTime((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        double double18 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        double double20 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getInitialTime();
        continuousOutputModel15.append(continuousOutputModel21);
        continuousOutputModel15.reset();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel0.append(continuousOutputModel15);
        double double29 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel15.handleStep(stepInterpolator30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        double double18 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        double double27 = continuousOutputModel25.getInitialTime();
        double double28 = continuousOutputModel25.getFinalTime();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel21.reset();
        continuousOutputModel19.append(continuousOutputModel21);
        continuousOutputModel0.append(continuousOutputModel19);
        boolean boolean33 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        java.lang.String str21 = derivativeException20.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str21, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException21);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) derivativeException24);
        java.io.IOException iOException26 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException24);
        java.lang.Object[] objArray27 = derivativeException24.getArguments();
        java.lang.String str28 = derivativeException24.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str28, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
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
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str3, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel7);
        continuousOutputModel5.reset();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        boolean boolean13 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getInitialTime();
        continuousOutputModel16.reset();
        double double21 = continuousOutputModel16.getInitialTime();
        continuousOutputModel14.append(continuousOutputModel16);
        boolean boolean23 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getFinalTime();
        java.lang.Class<?> wildcardClass5 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        boolean boolean13 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getInitialTime();
        continuousOutputModel16.reset();
        double double21 = continuousOutputModel16.getInitialTime();
        continuousOutputModel14.append(continuousOutputModel16);
        boolean boolean23 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        double double14 = continuousOutputModel9.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel9);
        double double16 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        double double18 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        double double27 = continuousOutputModel25.getInitialTime();
        double double28 = continuousOutputModel25.getFinalTime();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel21.reset();
        continuousOutputModel19.append(continuousOutputModel21);
        continuousOutputModel0.append(continuousOutputModel19);
        boolean boolean33 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator35, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray5 = derivativeException3.getSuppressed();
        java.lang.String str6 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str6, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str2, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String str13 = derivativeException12.getPattern();
        java.lang.String str14 = derivativeException12.getPattern();
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException12);
        derivativeException4.addSuppressed((java.lang.Throwable) iOException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray18 = iOException15.getSuppressed();
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException15);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException");
        java.lang.Throwable[] throwableArray34 = iOException33.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        derivativeException31.addSuppressed((java.lang.Throwable) derivativeException35);
        iOException15.addSuppressed((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        java.lang.Class<?> wildcardClass39 = iOException38.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double8 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        double double12 = continuousOutputModel0.getInitialTime();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        double double16 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException17);
        java.io.IOException iOException19 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException19);
        java.lang.Class<?> wildcardClass22 = iOException21.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getInitialTime();
        continuousOutputModel4.reset();
        double double9 = continuousOutputModel4.getInitialTime();
        continuousOutputModel2.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = continuousOutputModel4.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel4.getInitialTime();
        double double10 = continuousOutputModel4.getFinalTime();
        continuousOutputModel4.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getFinalTime();
        continuousOutputModel21.reset();
        continuousOutputModel12.append(continuousOutputModel21);
        continuousOutputModel12.reset();
        continuousOutputModel4.append(continuousOutputModel12);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.handleStep(stepInterpolator29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Class<?> wildcardClass10 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        double double18 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        double double20 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getInitialTime();
        continuousOutputModel15.append(continuousOutputModel21);
        continuousOutputModel15.reset();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel0.append(continuousOutputModel15);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        continuousOutputModel29.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        double double35 = continuousOutputModel32.getFinalTime();
        continuousOutputModel32.reset();
        continuousOutputModel29.append(continuousOutputModel32);
        boolean boolean38 = continuousOutputModel29.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean40 = continuousOutputModel39.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean42 = continuousOutputModel41.requiresDenseOutput();
        continuousOutputModel39.append(continuousOutputModel41);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean45 = continuousOutputModel44.requiresDenseOutput();
        double double46 = continuousOutputModel44.getInitialTime();
        double double47 = continuousOutputModel44.getInitialTime();
        continuousOutputModel44.reset();
        double double49 = continuousOutputModel44.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean51 = continuousOutputModel50.requiresDenseOutput();
        double double52 = continuousOutputModel50.getInitialTime();
        double double53 = continuousOutputModel50.getInitialTime();
        continuousOutputModel44.append(continuousOutputModel50);
        continuousOutputModel44.reset();
        continuousOutputModel39.append(continuousOutputModel44);
        continuousOutputModel29.append(continuousOutputModel44);
        continuousOutputModel15.append(continuousOutputModel44);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel59 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean60 = continuousOutputModel59.requiresDenseOutput();
        double double61 = continuousOutputModel59.getInitialTime();
        double double62 = continuousOutputModel59.getInitialTime();
        boolean boolean63 = continuousOutputModel59.requiresDenseOutput();
        double double64 = continuousOutputModel59.getInitialTime();
        boolean boolean65 = continuousOutputModel59.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean67 = continuousOutputModel66.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel68 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean69 = continuousOutputModel68.requiresDenseOutput();
        double double70 = continuousOutputModel68.getInitialTime();
        double double71 = continuousOutputModel68.getInitialTime();
        continuousOutputModel68.reset();
        double double73 = continuousOutputModel68.getInitialTime();
        continuousOutputModel66.append(continuousOutputModel68);
        double double75 = continuousOutputModel66.getInitialTime();
        continuousOutputModel59.append(continuousOutputModel66);
        double double77 = continuousOutputModel59.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel78 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel78.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel80 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean81 = continuousOutputModel80.requiresDenseOutput();
        continuousOutputModel80.reset();
        boolean boolean83 = continuousOutputModel80.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel84 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean85 = continuousOutputModel84.requiresDenseOutput();
        double double86 = continuousOutputModel84.getInitialTime();
        double double87 = continuousOutputModel84.getFinalTime();
        continuousOutputModel80.append(continuousOutputModel84);
        continuousOutputModel80.reset();
        continuousOutputModel78.append(continuousOutputModel80);
        continuousOutputModel59.append(continuousOutputModel78);
        continuousOutputModel15.append(continuousOutputModel78);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray93 = continuousOutputModel15.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        double double5 = continuousOutputModel0.getInitialTime();
        double double6 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        continuousOutputModel11.reset();
        boolean boolean15 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        continuousOutputModel0.append(continuousOutputModel11);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = continuousOutputModel11.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        java.lang.Class<?> wildcardClass10 = continuousOutputModel2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        double double7 = continuousOutputModel3.getInitialTime();
        java.lang.Class<?> wildcardClass8 = continuousOutputModel3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getFinalTime();
        continuousOutputModel12.reset();
        continuousOutputModel9.append(continuousOutputModel12);
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        double double21 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.String str7 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        double double8 = continuousOutputModel0.getFinalTime();
        java.lang.Class<?> wildcardClass9 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        derivativeException8.addSuppressed((java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException17 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) derivativeException16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.Class<?> wildcardClass20 = derivativeException16.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        continuousOutputModel11.reset();
        boolean boolean15 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        continuousOutputModel0.append(continuousOutputModel11);
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        continuousOutputModel11.reset();
        boolean boolean15 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        continuousOutputModel0.append(continuousOutputModel11);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel11.handleStep(stepInterpolator18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel3.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getFinalTime();
        double double12 = continuousOutputModel8.getInitialTime();
        continuousOutputModel3.append(continuousOutputModel8);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.setInterpolatedTime((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel2.reset();
        boolean boolean6 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        double double8 = continuousOutputModel2.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.setInterpolatedTime((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel9);
        continuousOutputModel7.reset();
        double double13 = continuousOutputModel7.getFinalTime();
        continuousOutputModel7.reset();
        continuousOutputModel0.append(continuousOutputModel7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException" + "'", str7, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.lang.String str10 = derivativeException9.getPattern();
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException9);
        java.lang.Object[] objArray12 = derivativeException9.getArguments();
        iOException4.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass14 = derivativeException9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        double double9 = continuousOutputModel7.getInitialTime();
        double double10 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double12 = continuousOutputModel7.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel7);
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        java.lang.Class<?> wildcardClass16 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        derivativeException8.addSuppressed((java.lang.Throwable) iOException13);
        java.lang.Object[] objArray16 = derivativeException8.getArguments();
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException8);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException17);
        java.lang.String str19 = iOException17.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[java.io.IOException, hi!, , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str19, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel11);
        continuousOutputModel11.reset();
        boolean boolean15 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        continuousOutputModel0.append(continuousOutputModel11);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        double double18 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        double double20 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getInitialTime();
        continuousOutputModel15.append(continuousOutputModel21);
        continuousOutputModel15.reset();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel0.append(continuousOutputModel15);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel15.handleStep(stepInterpolator29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        double double15 = continuousOutputModel13.getInitialTime();
        double double16 = continuousOutputModel13.getInitialTime();
        continuousOutputModel13.reset();
        double double18 = continuousOutputModel13.getInitialTime();
        continuousOutputModel11.append(continuousOutputModel13);
        boolean boolean20 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel13);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel13.setInterpolatedTime(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        double double17 = continuousOutputModel12.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel12);
        boolean boolean19 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double9 = continuousOutputModel0.getFinalTime();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.io.IOException iOException1 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.Object[] objArray3 = derivativeException2.getArguments();
        java.lang.Object[] objArray4 = derivativeException2.getArguments();
        java.lang.Object[] objArray5 = derivativeException2.getArguments();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException2);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException", (java.lang.Throwable) derivativeException2);
        java.lang.String str8 = derivativeException2.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str8, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        continuousOutputModel10.append(continuousOutputModel13);
        continuousOutputModel10.reset();
        continuousOutputModel10.reset();
        double double19 = continuousOutputModel10.getFinalTime();
        boolean boolean20 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel10);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel2.handleStep(stepInterpolator22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel16.reset();
        continuousOutputModel13.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel16);
        continuousOutputModel16.reset();
        boolean boolean22 = continuousOutputModel16.requiresDenseOutput();
        boolean boolean23 = continuousOutputModel16.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel16.setInterpolatedTime((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray7);
        java.lang.Class<?> wildcardClass11 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double9 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        double double11 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        continuousOutputModel10.append(continuousOutputModel13);
        continuousOutputModel10.reset();
        continuousOutputModel10.reset();
        double double19 = continuousOutputModel10.getFinalTime();
        boolean boolean20 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel10);
        double double22 = continuousOutputModel2.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = continuousOutputModel2.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        double double2 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException20);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.Class<?> wildcardClass24 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        double double13 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.String[] strArray2 = new java.lang.String[] { "java.io.IOException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        double double11 = continuousOutputModel8.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel8.append(continuousOutputModel12);
        boolean boolean17 = continuousOutputModel8.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel8.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean22 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        continuousOutputModel19.reset();
        continuousOutputModel8.append(continuousOutputModel19);
        continuousOutputModel0.append(continuousOutputModel19);
        continuousOutputModel19.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.setInterpolatedTime((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray2);
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException4.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double10 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getInitialTime();
        continuousOutputModel11.reset();
        double double16 = continuousOutputModel11.getInitialTime();
        continuousOutputModel11.reset();
        boolean boolean18 = continuousOutputModel11.requiresDenseOutput();
        double double19 = continuousOutputModel11.getFinalTime();
        boolean boolean20 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean22 = continuousOutputModel11.requiresDenseOutput();
        double double23 = continuousOutputModel11.getInitialTime();
        double double24 = continuousOutputModel11.getFinalTime();
        double double25 = continuousOutputModel11.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = continuousOutputModel11.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel2);
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        double double7 = continuousOutputModel0.getFinalTime();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass10 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel16.reset();
        continuousOutputModel13.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel16);
        continuousOutputModel16.reset();
        boolean boolean22 = continuousOutputModel16.requiresDenseOutput();
        java.lang.Class<?> wildcardClass23 = continuousOutputModel16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getFinalTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.lang.Class<?> wildcardClass10 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        continuousOutputModel10.append(continuousOutputModel13);
        continuousOutputModel10.reset();
        continuousOutputModel10.reset();
        double double19 = continuousOutputModel10.getFinalTime();
        boolean boolean20 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel10);
        double double22 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getInitialTime();
        boolean boolean27 = continuousOutputModel23.requiresDenseOutput();
        double double28 = continuousOutputModel23.getInitialTime();
        boolean boolean29 = continuousOutputModel23.requiresDenseOutput();
        double double30 = continuousOutputModel23.getInitialTime();
        boolean boolean31 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel23);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = continuousOutputModel10.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean7 = continuousOutputModel3.requiresDenseOutput();
        java.lang.Class<?> wildcardClass8 = continuousOutputModel3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Throwable[] throwableArray8 = derivativeException7.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass15 = derivativeException14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Throwable[] throwableArray8 = derivativeException7.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray14 = derivativeException7.getSuppressed();
        java.lang.Throwable[] throwableArray15 = derivativeException7.getSuppressed();
        java.lang.String str16 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str16, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException20);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        java.io.IOException iOException32 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException31);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException31);
        java.lang.Object[] objArray34 = derivativeException31.getArguments();
        java.io.IOException iOException37 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException37);
        java.io.IOException iOException39 = new java.io.IOException("", (java.lang.Throwable) iOException37);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        derivativeException47.addSuppressed((java.lang.Throwable) derivativeException55);
        iOException39.addSuppressed((java.lang.Throwable) derivativeException47);
        derivativeException31.addSuppressed((java.lang.Throwable) iOException39);
        java.io.IOException iOException61 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException62 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException61);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException62);
        derivativeException31.addSuppressed((java.lang.Throwable) derivativeException63);
        java.lang.Throwable[] throwableArray65 = derivativeException31.getSuppressed();
        java.lang.String str66 = derivativeException31.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, , hi!, java.io.IOException, java.io.IOException]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str66, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double13 = continuousOutputModel0.getInitialTime();
        java.lang.Class<?> wildcardClass14 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel3.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getFinalTime();
        double double12 = continuousOutputModel8.getInitialTime();
        continuousOutputModel3.append(continuousOutputModel8);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = continuousOutputModel3.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("hi!", (java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException3);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str7, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.String str9 = derivativeException8.getPattern();
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        derivativeException8.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String str13 = derivativeException8.getPattern();
        java.lang.String str14 = derivativeException8.getPattern();
        iOException6.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.String str16 = iOException6.toString();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str16, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        continuousOutputModel0.reset();
        double double8 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        continuousOutputModel10.append(continuousOutputModel13);
        continuousOutputModel10.reset();
        continuousOutputModel10.reset();
        double double19 = continuousOutputModel10.getFinalTime();
        boolean boolean20 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel10);
        double double22 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        double double26 = continuousOutputModel23.getInitialTime();
        boolean boolean27 = continuousOutputModel23.requiresDenseOutput();
        double double28 = continuousOutputModel23.getInitialTime();
        boolean boolean29 = continuousOutputModel23.requiresDenseOutput();
        double double30 = continuousOutputModel23.getInitialTime();
        boolean boolean31 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel23);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel23.handleStep(stepInterpolator33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        double double5 = continuousOutputModel2.getInitialTime();
        continuousOutputModel2.reset();
        double double7 = continuousOutputModel2.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel2);
        boolean boolean9 = continuousOutputModel2.requiresDenseOutput();
        continuousOutputModel2.reset();
        continuousOutputModel2.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        double double16 = continuousOutputModel14.getInitialTime();
        double double17 = continuousOutputModel14.getInitialTime();
        continuousOutputModel14.reset();
        double double19 = continuousOutputModel14.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel14);
        double double21 = continuousOutputModel12.getFinalTime();
        boolean boolean22 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel12);
        java.lang.Class<?> wildcardClass24 = continuousOutputModel12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.Throwable[] throwableArray8 = derivativeException6.getSuppressed();
        java.lang.String str9 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
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
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getFinalTime();
        continuousOutputModel12.reset();
        continuousOutputModel9.append(continuousOutputModel12);
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        double double21 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        double double8 = continuousOutputModel5.getInitialTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        double double10 = continuousOutputModel5.getInitialTime();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        double double15 = continuousOutputModel13.getInitialTime();
        double double16 = continuousOutputModel13.getFinalTime();
        continuousOutputModel13.reset();
        double double18 = continuousOutputModel13.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel13);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel13.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException", "hi!", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        derivativeException8.addSuppressed((java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException17 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) derivativeException16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.String str20 = derivativeException19.getPattern();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "hi!", "java.io.IOException", "java.io.IOException" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException28);
        java.lang.String str30 = derivativeException29.getPattern();
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException29);
        java.lang.String str32 = derivativeException29.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str32, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        double double18 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        double double20 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        double double24 = continuousOutputModel21.getInitialTime();
        continuousOutputModel15.append(continuousOutputModel21);
        continuousOutputModel15.reset();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel0.append(continuousOutputModel15);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        double double6 = continuousOutputModel4.getInitialTime();
        double double7 = continuousOutputModel4.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass10 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

