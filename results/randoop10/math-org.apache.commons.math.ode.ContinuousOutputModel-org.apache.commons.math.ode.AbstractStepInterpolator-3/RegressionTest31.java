import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
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
        continuousOutputModel0.reset();
        double double19 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        double double22 = continuousOutputModel20.getInitialTime();
        boolean boolean23 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        double double26 = continuousOutputModel24.getInitialTime();
        boolean boolean27 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel24.reset();
        boolean boolean29 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel24);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getFinalTime();
        double double33 = continuousOutputModel31.getInitialTime();
        boolean boolean34 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel31.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        double double38 = continuousOutputModel36.getInitialTime();
        continuousOutputModel31.append(continuousOutputModel36);
        continuousOutputModel20.append(continuousOutputModel31);
        continuousOutputModel20.reset();
        boolean boolean42 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel20);
        continuousOutputModel20.reset();
        double double45 = continuousOutputModel20.getFinalTime();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
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
        java.lang.String str21 = mathException18.getPattern();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException18);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) mathException22);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str19, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str21, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getFinalTime();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel8.reset();
        boolean boolean12 = continuousOutputModel8.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        double double15 = continuousOutputModel13.getInitialTime();
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel13.append(continuousOutputModel17);
        continuousOutputModel8.append(continuousOutputModel17);
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel17);
        continuousOutputModel17.reset();
        continuousOutputModel17.reset();
        continuousOutputModel17.reset();
        double double27 = continuousOutputModel17.getInitialTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: hi!");
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException3.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException6);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException22);
        java.io.IOException iOException28 = new java.io.IOException();
        java.lang.Throwable[] throwableArray29 = iOException28.getSuppressed();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray29);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray42);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray42);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray42);
        java.io.IOException iOException49 = new java.io.IOException("hi!");
        java.io.IOException iOException50 = new java.io.IOException("", (java.lang.Throwable) iOException49);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray42, (java.lang.Throwable) iOException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) iOException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException53);
        java.lang.String str55 = mathException53.getPattern();
        mathException24.addSuppressed((java.lang.Throwable) mathException53);
        java.lang.Object[] objArray57 = mathException53.getArguments();
        java.lang.Object[] objArray58 = mathException53.getArguments();
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray58);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str55, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
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
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        double double11 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        double double13 = continuousOutputModel0.getInitialTime();
        boolean boolean14 = continuousOutputModel0.requiresDenseOutput();
        double double15 = continuousOutputModel0.getInitialTime();
        double double16 = continuousOutputModel0.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        double double24 = continuousOutputModel22.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel22);
        continuousOutputModel12.append(continuousOutputModel22);
        continuousOutputModel12.reset();
        boolean boolean28 = continuousOutputModel12.requiresDenseOutput();
        double double29 = continuousOutputModel12.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray15);
        java.io.IOException iOException22 = new java.io.IOException("hi!");
        java.io.IOException iOException23 = new java.io.IOException("", (java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray15, (java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray15);
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException(throwable29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("java.io.IOException: hi!", throwable29);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str34 = mathException33.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException33);
        mathException31.addSuppressed((java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ");
        mathException33.addSuppressed((java.lang.Throwable) mathException38);
        java.io.IOException iOException40 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray15, (java.lang.Throwable) iOException40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("hi!");
        java.io.IOException iOException8 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        mathException4.addSuppressed((java.lang.Throwable) iOException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) mathException17);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getFinalTime();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        double double24 = continuousOutputModel22.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel22);
        continuousOutputModel12.append(continuousOutputModel22);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean29 = continuousOutputModel28.requiresDenseOutput();
        boolean boolean30 = continuousOutputModel28.requiresDenseOutput();
        double double31 = continuousOutputModel28.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel28.append(continuousOutputModel32);
        continuousOutputModel27.append(continuousOutputModel32);
        double double36 = continuousOutputModel27.getFinalTime();
        boolean boolean37 = continuousOutputModel27.requiresDenseOutput();
        continuousOutputModel22.append(continuousOutputModel27);
        boolean boolean39 = continuousOutputModel27.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException1);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray5);
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException15);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) mathException21);
        java.io.IOException iOException23 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray5, (java.lang.Throwable) iOException22);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) mathException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.lang.Class<?> wildcardClass28 = iOException27.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
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
        boolean boolean12 = continuousOutputModel5.requiresDenseOutput();
        double double13 = continuousOutputModel5.getInitialTime();
        boolean boolean14 = continuousOutputModel5.requiresDenseOutput();
        double double15 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator17, true);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel36);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        double double44 = continuousOutputModel40.getInitialTime();
        continuousOutputModel40.reset();
        boolean boolean46 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel15.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean52 = continuousOutputModel51.requiresDenseOutput();
        boolean boolean53 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel51.reset();
        boolean boolean55 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel51.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double58 = continuousOutputModel57.getFinalTime();
        continuousOutputModel57.reset();
        continuousOutputModel51.append(continuousOutputModel57);
        continuousOutputModel57.reset();
        boolean boolean62 = continuousOutputModel57.requiresDenseOutput();
        continuousOutputModel57.reset();
        boolean boolean64 = continuousOutputModel57.requiresDenseOutput();
        boolean boolean65 = continuousOutputModel57.requiresDenseOutput();
        continuousOutputModel40.append(continuousOutputModel57);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel67 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean68 = continuousOutputModel67.requiresDenseOutput();
        boolean boolean69 = continuousOutputModel67.requiresDenseOutput();
        continuousOutputModel67.reset();
        boolean boolean71 = continuousOutputModel67.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel72 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double73 = continuousOutputModel72.getFinalTime();
        double double74 = continuousOutputModel72.getInitialTime();
        boolean boolean75 = continuousOutputModel72.requiresDenseOutput();
        continuousOutputModel67.append(continuousOutputModel72);
        double double77 = continuousOutputModel72.getInitialTime();
        double double78 = continuousOutputModel72.getFinalTime();
        continuousOutputModel72.reset();
        continuousOutputModel72.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel81 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean82 = continuousOutputModel81.requiresDenseOutput();
        boolean boolean83 = continuousOutputModel81.requiresDenseOutput();
        double double84 = continuousOutputModel81.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel85 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean86 = continuousOutputModel85.requiresDenseOutput();
        continuousOutputModel81.append(continuousOutputModel85);
        continuousOutputModel72.append(continuousOutputModel81);
        boolean boolean89 = continuousOutputModel81.requiresDenseOutput();
        continuousOutputModel57.append(continuousOutputModel81);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator91 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel57.handleStep(stepInterpolator91, false);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
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
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", objArray29);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) mathException30);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("", strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray44);
        java.io.IOException iOException51 = new java.io.IOException("hi!");
        java.io.IOException iOException52 = new java.io.IOException("", (java.lang.Throwable) iOException51);
        java.io.IOException iOException53 = new java.io.IOException((java.lang.Throwable) iOException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray44, (java.lang.Throwable) iOException53);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException58 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException58);
        mathException56.addSuppressed((java.lang.Throwable) iOException58);
        mathException54.addSuppressed((java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException54);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException54);
        java.lang.String str65 = mathException54.getPattern();
        mathException30.addSuppressed((java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException30);
        java.lang.Object[] objArray68 = mathException67.getArguments();
        java.io.IOException iOException69 = new java.io.IOException((java.lang.Throwable) mathException67);
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException67);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException67);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException67);
        java.lang.Object[] objArray73 = mathException72.getArguments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double8 = continuousOutputModel0.getFinalTime();
        double double9 = continuousOutputModel0.getInitialTime();
        double double10 = continuousOutputModel0.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        java.io.IOException iOException4 = new java.io.IOException();
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray18);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray18, (java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray5);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray43);
        java.io.IOException iOException50 = new java.io.IOException("hi!");
        java.io.IOException iOException51 = new java.io.IOException("", (java.lang.Throwable) iOException50);
        java.io.IOException iOException52 = new java.io.IOException((java.lang.Throwable) iOException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray43, (java.lang.Throwable) iOException52);
        java.io.IOException iOException56 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray43, (java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException58);
        java.lang.String str61 = mathException60.getPattern();
        java.lang.String str62 = mathException60.getPattern();
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException60);
        java.io.IOException iOException64 = new java.io.IOException((java.lang.Throwable) mathException60);
        java.lang.Throwable[] throwableArray65 = mathException60.getSuppressed();
        java.lang.String[] strArray70 = new java.lang.String[] { "org.apache.commons.math.MathException: hi!", "java.io.IOException: ", "java.io.IOException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException("", strArray70);
        java.io.IOException iOException74 = new java.io.IOException("hi!");
        java.io.IOException iOException75 = new java.io.IOException("", (java.lang.Throwable) iOException74);
        java.io.IOException iOException76 = new java.io.IOException((java.lang.Throwable) iOException75);
        java.io.IOException iOException81 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException81);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException81);
        java.lang.Object[] objArray84 = mathException83.getArguments();
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray84);
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray84, (java.lang.Throwable) mathException87);
        iOException76.addSuppressed((java.lang.Throwable) mathException88);
        org.apache.commons.math.ode.DerivativeException derivativeException90 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException76);
        derivativeException71.addSuppressed((java.lang.Throwable) derivativeException90);
        java.lang.String str92 = derivativeException90.getPattern();
        mathException60.addSuppressed((java.lang.Throwable) derivativeException90);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "java.io.IOException: " + "'", str92, "java.io.IOException: ");
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        double double11 = continuousOutputModel7.getInitialTime();
        boolean boolean12 = continuousOutputModel7.requiresDenseOutput();
        double double13 = continuousOutputModel7.getInitialTime();
        double double14 = continuousOutputModel7.getInitialTime();
        double double15 = continuousOutputModel7.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel20);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean25 = continuousOutputModel24.requiresDenseOutput();
        double double26 = continuousOutputModel24.getInitialTime();
        double double27 = continuousOutputModel24.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel24);
        double double29 = continuousOutputModel24.getInitialTime();
        continuousOutputModel24.reset();
        continuousOutputModel24.reset();
        boolean boolean32 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel24);
        continuousOutputModel0.append(continuousOutputModel24);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean36 = continuousOutputModel35.requiresDenseOutput();
        double double37 = continuousOutputModel35.getInitialTime();
        boolean boolean38 = continuousOutputModel35.requiresDenseOutput();
        boolean boolean39 = continuousOutputModel35.requiresDenseOutput();
        double double40 = continuousOutputModel35.getFinalTime();
        double double41 = continuousOutputModel35.getInitialTime();
        boolean boolean42 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel35.reset();
        continuousOutputModel0.append(continuousOutputModel35);
        double double45 = continuousOutputModel35.getInitialTime();
        boolean boolean46 = continuousOutputModel35.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean48 = continuousOutputModel47.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel47.reset();
        boolean boolean51 = continuousOutputModel47.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double53 = continuousOutputModel52.getFinalTime();
        double double54 = continuousOutputModel52.getInitialTime();
        boolean boolean55 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel47.append(continuousOutputModel52);
        boolean boolean57 = continuousOutputModel52.requiresDenseOutput();
        double double58 = continuousOutputModel52.getFinalTime();
        continuousOutputModel52.reset();
        boolean boolean60 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel35.append(continuousOutputModel52);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException5.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        java.io.IOException iOException13 = new java.io.IOException("hi!");
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException15);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException15);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException25);
        java.lang.Object[] objArray28 = mathException27.getArguments();
        java.lang.Throwable[] throwableArray29 = mathException27.getSuppressed();
        java.lang.String str30 = mathException27.getPattern();
        java.lang.Throwable[] throwableArray31 = mathException27.getSuppressed();
        java.lang.Throwable throwable32 = null;
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray31, throwable32);
        // The following exception was thrown during execution in test generation
        try {
            iOException19.addSuppressed(throwable32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.MathException: " + "'", str30, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel36);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        double double44 = continuousOutputModel40.getInitialTime();
        continuousOutputModel40.reset();
        boolean boolean46 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel15.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        double double51 = continuousOutputModel40.getInitialTime();
        double double52 = continuousOutputModel40.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double53 = continuousOutputModel40.getInterpolatedTime();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double10 = continuousOutputModel0.getFinalTime();
        double double11 = continuousOutputModel0.getFinalTime();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel16.reset();
        boolean boolean21 = continuousOutputModel16.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel16.requiresDenseOutput();
        double double23 = continuousOutputModel16.getInitialTime();
        continuousOutputModel13.append(continuousOutputModel16);
        double double25 = continuousOutputModel13.getFinalTime();
        double double26 = continuousOutputModel13.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean29 = continuousOutputModel28.requiresDenseOutput();
        double double30 = continuousOutputModel28.getInitialTime();
        boolean boolean31 = continuousOutputModel28.requiresDenseOutput();
        boolean boolean32 = continuousOutputModel28.requiresDenseOutput();
        double double33 = continuousOutputModel28.getFinalTime();
        double double34 = continuousOutputModel28.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel28);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double37 = continuousOutputModel36.getFinalTime();
        double double38 = continuousOutputModel36.getInitialTime();
        boolean boolean39 = continuousOutputModel36.requiresDenseOutput();
        double double40 = continuousOutputModel36.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean42 = continuousOutputModel41.requiresDenseOutput();
        boolean boolean43 = continuousOutputModel41.requiresDenseOutput();
        continuousOutputModel41.reset();
        boolean boolean45 = continuousOutputModel41.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double47 = continuousOutputModel46.getFinalTime();
        double double48 = continuousOutputModel46.getInitialTime();
        boolean boolean49 = continuousOutputModel46.requiresDenseOutput();
        continuousOutputModel41.append(continuousOutputModel46);
        continuousOutputModel36.append(continuousOutputModel41);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean53 = continuousOutputModel52.requiresDenseOutput();
        double double54 = continuousOutputModel52.getInitialTime();
        boolean boolean55 = continuousOutputModel52.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean57 = continuousOutputModel56.requiresDenseOutput();
        boolean boolean58 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel52.append(continuousOutputModel56);
        continuousOutputModel41.append(continuousOutputModel52);
        boolean boolean61 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel52.reset();
        boolean boolean63 = continuousOutputModel52.requiresDenseOutput();
        boolean boolean64 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel28.append(continuousOutputModel52);
        continuousOutputModel28.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        double double15 = continuousOutputModel12.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getFinalTime();
        double double20 = continuousOutputModel16.getInitialTime();
        boolean boolean21 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel12.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel12);
        boolean boolean24 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        java.lang.String str9 = derivativeException8.getPattern();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray11 = derivativeException8.getArguments();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException12);
        java.lang.String str14 = mathException13.getPattern();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException13);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) mathException13);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray13);
        java.lang.Object[] objArray21 = derivativeException20.getArguments();
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
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
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean17 = continuousOutputModel0.requiresDenseOutput();
        double double18 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double20 = continuousOutputModel19.getFinalTime();
        double double21 = continuousOutputModel19.getInitialTime();
        boolean boolean22 = continuousOutputModel19.requiresDenseOutput();
        double double23 = continuousOutputModel19.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean25 = continuousOutputModel24.requiresDenseOutput();
        boolean boolean26 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel24.reset();
        boolean boolean28 = continuousOutputModel24.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double30 = continuousOutputModel29.getFinalTime();
        double double31 = continuousOutputModel29.getInitialTime();
        boolean boolean32 = continuousOutputModel29.requiresDenseOutput();
        continuousOutputModel24.append(continuousOutputModel29);
        continuousOutputModel19.append(continuousOutputModel24);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean36 = continuousOutputModel35.requiresDenseOutput();
        double double37 = continuousOutputModel35.getInitialTime();
        boolean boolean38 = continuousOutputModel35.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean40 = continuousOutputModel39.requiresDenseOutput();
        boolean boolean41 = continuousOutputModel39.requiresDenseOutput();
        continuousOutputModel35.append(continuousOutputModel39);
        continuousOutputModel24.append(continuousOutputModel35);
        double double44 = continuousOutputModel35.getInitialTime();
        continuousOutputModel35.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double47 = continuousOutputModel46.getFinalTime();
        double double48 = continuousOutputModel46.getInitialTime();
        boolean boolean49 = continuousOutputModel46.requiresDenseOutput();
        double double50 = continuousOutputModel46.getInitialTime();
        continuousOutputModel46.reset();
        double double52 = continuousOutputModel46.getInitialTime();
        continuousOutputModel46.reset();
        continuousOutputModel46.reset();
        boolean boolean55 = continuousOutputModel46.requiresDenseOutput();
        double double56 = continuousOutputModel46.getFinalTime();
        double double57 = continuousOutputModel46.getInitialTime();
        continuousOutputModel35.append(continuousOutputModel46);
        boolean boolean59 = continuousOutputModel35.requiresDenseOutput();
        boolean boolean60 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel35);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel62 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean63 = continuousOutputModel62.requiresDenseOutput();
        double double64 = continuousOutputModel62.getInitialTime();
        boolean boolean65 = continuousOutputModel62.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double67 = continuousOutputModel66.getFinalTime();
        double double68 = continuousOutputModel66.getInitialTime();
        boolean boolean69 = continuousOutputModel66.requiresDenseOutput();
        continuousOutputModel66.reset();
        boolean boolean71 = continuousOutputModel66.requiresDenseOutput();
        continuousOutputModel62.append(continuousOutputModel66);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel73 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double74 = continuousOutputModel73.getFinalTime();
        double double75 = continuousOutputModel73.getInitialTime();
        boolean boolean76 = continuousOutputModel73.requiresDenseOutput();
        continuousOutputModel73.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel78 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean79 = continuousOutputModel78.requiresDenseOutput();
        double double80 = continuousOutputModel78.getInitialTime();
        continuousOutputModel73.append(continuousOutputModel78);
        continuousOutputModel62.append(continuousOutputModel73);
        boolean boolean83 = continuousOutputModel62.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel84 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double85 = continuousOutputModel84.getFinalTime();
        double double86 = continuousOutputModel84.getInitialTime();
        double double87 = continuousOutputModel84.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel88 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double89 = continuousOutputModel88.getFinalTime();
        double double90 = continuousOutputModel88.getInitialTime();
        continuousOutputModel84.append(continuousOutputModel88);
        continuousOutputModel88.reset();
        continuousOutputModel88.reset();
        continuousOutputModel62.append(continuousOutputModel88);
        continuousOutputModel62.reset();
        continuousOutputModel0.append(continuousOutputModel62);
        double double97 = continuousOutputModel62.getInitialTime();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
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
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException33);
        java.lang.String str35 = derivativeException34.getPattern();
        java.lang.String str36 = derivativeException34.getPattern();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException23);
        java.lang.String str25 = derivativeException24.toString();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str25, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        double double14 = continuousOutputModel12.getInitialTime();
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel16.reset();
        boolean boolean21 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel12.append(continuousOutputModel16);
        continuousOutputModel8.append(continuousOutputModel12);
        double double24 = continuousOutputModel12.getInitialTime();
        continuousOutputModel12.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        double double28 = continuousOutputModel26.getInitialTime();
        double double29 = continuousOutputModel26.getFinalTime();
        boolean boolean30 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel26.reset();
        double double32 = continuousOutputModel26.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel26);
        boolean boolean34 = continuousOutputModel26.requiresDenseOutput();
        boolean boolean35 = continuousOutputModel26.requiresDenseOutput();
        double double36 = continuousOutputModel26.getFinalTime();
        boolean boolean37 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        java.io.IOException iOException7 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException7);
        java.lang.Object[] objArray10 = mathException9.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray10, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException13);
        java.io.IOException iOException16 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException18);
        java.lang.Object[] objArray20 = mathException19.getArguments();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double9 = continuousOutputModel0.getInitialTime();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
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
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        double double17 = continuousOutputModel14.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean20 = continuousOutputModel18.requiresDenseOutput();
        double double21 = continuousOutputModel18.getFinalTime();
        double double22 = continuousOutputModel18.getInitialTime();
        boolean boolean23 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel14.append(continuousOutputModel18);
        continuousOutputModel0.append(continuousOutputModel18);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean28 = continuousOutputModel27.requiresDenseOutput();
        boolean boolean29 = continuousOutputModel27.requiresDenseOutput();
        double double30 = continuousOutputModel27.getFinalTime();
        continuousOutputModel27.reset();
        boolean boolean32 = continuousOutputModel27.requiresDenseOutput();
        continuousOutputModel27.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double35 = continuousOutputModel34.getFinalTime();
        continuousOutputModel27.append(continuousOutputModel34);
        double double37 = continuousOutputModel34.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double39 = continuousOutputModel38.getFinalTime();
        double double40 = continuousOutputModel38.getInitialTime();
        double double41 = continuousOutputModel38.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel42 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double43 = continuousOutputModel42.getFinalTime();
        double double44 = continuousOutputModel42.getInitialTime();
        continuousOutputModel38.append(continuousOutputModel42);
        double double46 = continuousOutputModel38.getFinalTime();
        boolean boolean47 = continuousOutputModel38.requiresDenseOutput();
        boolean boolean48 = continuousOutputModel38.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel38.requiresDenseOutput();
        boolean boolean50 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel38.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean53 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel52.reset();
        double double55 = continuousOutputModel52.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean57 = continuousOutputModel56.requiresDenseOutput();
        boolean boolean58 = continuousOutputModel56.requiresDenseOutput();
        double double59 = continuousOutputModel56.getFinalTime();
        double double60 = continuousOutputModel56.getInitialTime();
        boolean boolean61 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel52.append(continuousOutputModel56);
        continuousOutputModel38.append(continuousOutputModel56);
        continuousOutputModel38.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel65 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double66 = continuousOutputModel65.getFinalTime();
        double double67 = continuousOutputModel65.getInitialTime();
        boolean boolean68 = continuousOutputModel65.requiresDenseOutput();
        continuousOutputModel65.reset();
        double double70 = continuousOutputModel65.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel71 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double72 = continuousOutputModel71.getFinalTime();
        double double73 = continuousOutputModel71.getInitialTime();
        continuousOutputModel65.append(continuousOutputModel71);
        continuousOutputModel65.reset();
        continuousOutputModel65.reset();
        continuousOutputModel65.reset();
        continuousOutputModel38.append(continuousOutputModel65);
        boolean boolean79 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel34.append(continuousOutputModel38);
        double double81 = continuousOutputModel34.getFinalTime();
        double double82 = continuousOutputModel34.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel34);
        continuousOutputModel34.reset();
        boolean boolean85 = continuousOutputModel34.requiresDenseOutput();
        continuousOutputModel34.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double4 = continuousOutputModel0.getInitialTime();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException("hi!");
        java.io.IOException iOException11 = new java.io.IOException("", (java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException17 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException17);
        java.lang.Object[] objArray20 = mathException19.getArguments();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray20, (java.lang.Throwable) mathException23);
        iOException12.addSuppressed((java.lang.Throwable) mathException24);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) mathException24);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException28);
        java.io.IOException iOException30 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException28);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        double double9 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean20 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        continuousOutputModel6.append(continuousOutputModel13);
        boolean boolean23 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean28 = continuousOutputModel27.requiresDenseOutput();
        boolean boolean29 = continuousOutputModel27.requiresDenseOutput();
        continuousOutputModel27.reset();
        boolean boolean31 = continuousOutputModel27.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double33 = continuousOutputModel32.getFinalTime();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel27.append(continuousOutputModel32);
        boolean boolean37 = continuousOutputModel32.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel32.reset();
        continuousOutputModel0.append(continuousOutputModel32);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass43 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
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
        continuousOutputModel4.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        double double20 = continuousOutputModel18.getInitialTime();
        double double21 = continuousOutputModel18.getFinalTime();
        boolean boolean22 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel18.reset();
        double double24 = continuousOutputModel18.getFinalTime();
        continuousOutputModel4.append(continuousOutputModel18);
        continuousOutputModel18.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel18.handleStep(stepInterpolator27, true);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        java.lang.String str8 = derivativeException7.getPattern();
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!" + "'", str8, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        double double32 = continuousOutputModel30.getInitialTime();
        double double33 = continuousOutputModel30.getFinalTime();
        boolean boolean34 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        continuousOutputModel19.append(continuousOutputModel30);
        double double37 = continuousOutputModel19.getFinalTime();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        continuousOutputModel19.reset();
        continuousOutputModel5.append(continuousOutputModel19);
        double double25 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        double double27 = continuousOutputModel19.getFinalTime();
        double double28 = continuousOutputModel19.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.setInterpolatedTime(0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: hi!", (java.lang.Throwable) mathException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException18);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray17);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray17, (java.lang.Throwable) iOException26);
        java.io.IOException iOException30 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException30);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray17, (java.lang.Throwable) mathException32);
        java.lang.Throwable throwable34 = null;
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray17, throwable34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray17);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray17);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException39);
        java.lang.String str41 = derivativeException39.toString();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str41, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException10);
        java.lang.Object[] objArray13 = mathException12.getArguments();
        mathException7.addSuppressed((java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException7);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException7);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
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
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) mathException19);
        java.lang.Object[] objArray21 = mathException19.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException23);
        iOException1.addSuppressed((java.lang.Throwable) derivativeException24);
        java.lang.String str26 = derivativeException24.toString();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str26, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.io.IOException iOException8 = new java.io.IOException("hi!");
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) iOException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException8);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray22);
        java.io.IOException iOException30 = new java.io.IOException("hi!");
        java.io.IOException iOException31 = new java.io.IOException("", (java.lang.Throwable) iOException30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException30);
        java.io.IOException iOException33 = new java.io.IOException("hi!", (java.lang.Throwable) iOException30);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) mathException34);
        iOException8.addSuppressed((java.lang.Throwable) mathException35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException8);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException37);
        java.lang.Throwable[] throwableArray39 = mathException37.getSuppressed();
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) throwableArray39);
        java.lang.String[] strArray49 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException51);
        java.io.IOException iOException59 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException59);
        java.lang.Object[] objArray62 = mathException61.getArguments();
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray62);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray62, (java.lang.Throwable) mathException65);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException65);
        java.io.IOException iOException68 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException67);
        derivativeException52.addSuppressed((java.lang.Throwable) iOException68);
        mathException40.addSuppressed((java.lang.Throwable) derivativeException52);
        java.lang.Throwable[] throwableArray71 = mathException40.getSuppressed();
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray71);
        mathException1.addSuppressed((java.lang.Throwable) mathException72);
        java.lang.Throwable[] throwableArray74 = mathException1.getSuppressed();
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray17);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray17, (java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: hi!", strArray17);
        java.lang.Throwable[] throwableArray34 = derivativeException33.getSuppressed();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
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
        continuousOutputModel5.reset();
        double double14 = continuousOutputModel5.getInitialTime();
        boolean boolean15 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
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
        continuousOutputModel14.reset();
        continuousOutputModel14.reset();
        continuousOutputModel14.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        double double28 = continuousOutputModel25.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        continuousOutputModel25.append(continuousOutputModel29);
        continuousOutputModel25.reset();
        boolean boolean33 = continuousOutputModel25.requiresDenseOutput();
        boolean boolean34 = continuousOutputModel25.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean36 = continuousOutputModel35.requiresDenseOutput();
        boolean boolean37 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel35.reset();
        boolean boolean39 = continuousOutputModel35.requiresDenseOutput();
        double double40 = continuousOutputModel35.getFinalTime();
        boolean boolean41 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel25.append(continuousOutputModel35);
        boolean boolean43 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel14.append(continuousOutputModel25);
        boolean boolean45 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel25.reset();
        double double47 = continuousOutputModel25.getInitialTime();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", strArray9);
        java.io.IOException iOException18 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException18);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray21, (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException24);
        java.io.IOException iOException27 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray9, (java.lang.Throwable) mathException26);
        java.lang.Throwable[] throwableArray29 = mathException28.getSuppressed();
        java.io.IOException iOException31 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException31);
        java.lang.Object[] objArray33 = derivativeException32.getArguments();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException34);
        java.lang.String str36 = mathException34.getPattern();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException34);
        mathException28.addSuppressed((java.lang.Throwable) mathException34);
        java.lang.String str40 = mathException28.getPattern();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str40, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray7);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException26);
        java.lang.Object[] objArray29 = mathException28.getArguments();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", objArray29);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double34 = continuousOutputModel33.getFinalTime();
        double double35 = continuousOutputModel33.getInitialTime();
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        double double37 = continuousOutputModel33.getInitialTime();
        java.io.IOException iOException40 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException40);
        java.io.IOException iOException45 = new java.io.IOException("hi!");
        java.io.IOException iOException46 = new java.io.IOException("", (java.lang.Throwable) iOException45);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException45);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double50 = continuousOutputModel49.getFinalTime();
        double double51 = continuousOutputModel49.getInitialTime();
        java.lang.Object[] objArray52 = new java.lang.Object[] { double37, mathException42, iOException45, false, continuousOutputModel49 };
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("", strArray61);
        java.io.IOException iOException66 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException66);
        java.lang.Object[] objArray69 = mathException68.getArguments();
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException68);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray61, (java.lang.Throwable) mathException68);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray52, (java.lang.Throwable) mathException71);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray29, (java.lang.Throwable) mathException72);
        derivativeException20.addSuppressed((java.lang.Throwable) mathException72);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException72);
        java.io.IOException iOException76 = new java.io.IOException((java.lang.Throwable) mathException72);
        java.lang.Throwable[] throwableArray77 = iOException76.getSuppressed();
        java.io.IOException iOException78 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException76);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray7, (java.lang.Throwable) iOException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException78);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        java.io.IOException iOException4 = new java.io.IOException();
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray18);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray18, (java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray5);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray43);
        java.io.IOException iOException50 = new java.io.IOException("hi!");
        java.io.IOException iOException51 = new java.io.IOException("", (java.lang.Throwable) iOException50);
        java.io.IOException iOException52 = new java.io.IOException((java.lang.Throwable) iOException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray43, (java.lang.Throwable) iOException52);
        java.io.IOException iOException56 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray43, (java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException58);
        java.lang.String str61 = mathException60.getPattern();
        java.lang.String str62 = mathException60.getPattern();
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException60);
        java.io.IOException iOException64 = new java.io.IOException((java.lang.Throwable) mathException60);
        java.lang.Throwable[] throwableArray65 = mathException60.getSuppressed();
        java.lang.Throwable[] throwableArray66 = mathException60.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
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
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        double double11 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
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
        double double10 = continuousOutputModel0.getInitialTime();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray14);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException21);
        java.lang.Object[] objArray23 = mathException22.getArguments();
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException27);
        java.lang.Object[] objArray29 = mathException28.getArguments();
        java.lang.Object[] objArray30 = mathException28.getArguments();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", objArray23, (java.lang.Throwable) mathException28);
        java.lang.String str32 = mathException31.getPattern();
        java.lang.Object[] objArray33 = mathException31.getArguments();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.MathException" + "'", str32, "org.apache.commons.math.MathException");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
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
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        double double20 = continuousOutputModel17.getFinalTime();
        continuousOutputModel4.append(continuousOutputModel17);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel22.append(continuousOutputModel26);
        boolean boolean30 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel26);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double33 = continuousOutputModel32.getFinalTime();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel32.reset();
        boolean boolean37 = continuousOutputModel32.requiresDenseOutput();
        double double38 = continuousOutputModel32.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double40 = continuousOutputModel39.getFinalTime();
        double double41 = continuousOutputModel39.getInitialTime();
        boolean boolean42 = continuousOutputModel39.requiresDenseOutput();
        double double43 = continuousOutputModel39.getInitialTime();
        continuousOutputModel39.reset();
        boolean boolean45 = continuousOutputModel39.requiresDenseOutput();
        double double46 = continuousOutputModel39.getInitialTime();
        continuousOutputModel32.append(continuousOutputModel39);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean49 = continuousOutputModel48.requiresDenseOutput();
        double double50 = continuousOutputModel48.getInitialTime();
        continuousOutputModel48.reset();
        double double52 = continuousOutputModel48.getInitialTime();
        continuousOutputModel32.append(continuousOutputModel48);
        double double54 = continuousOutputModel48.getInitialTime();
        double double55 = continuousOutputModel48.getInitialTime();
        boolean boolean56 = continuousOutputModel48.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel48);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double59 = continuousOutputModel58.getFinalTime();
        double double60 = continuousOutputModel58.getInitialTime();
        boolean boolean61 = continuousOutputModel58.requiresDenseOutput();
        double double62 = continuousOutputModel58.getInitialTime();
        continuousOutputModel58.reset();
        boolean boolean64 = continuousOutputModel58.requiresDenseOutput();
        boolean boolean65 = continuousOutputModel58.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean67 = continuousOutputModel66.requiresDenseOutput();
        double double68 = continuousOutputModel66.getInitialTime();
        double double69 = continuousOutputModel66.getInitialTime();
        continuousOutputModel58.append(continuousOutputModel66);
        continuousOutputModel66.reset();
        double double72 = continuousOutputModel66.getFinalTime();
        continuousOutputModel66.reset();
        double double74 = continuousOutputModel66.getInitialTime();
        continuousOutputModel48.append(continuousOutputModel66);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Object[] objArray4 = derivativeException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        java.io.IOException iOException12 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) mathException14);
        java.io.IOException iOException21 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException21);
        java.lang.Object[] objArray24 = mathException23.getArguments();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray24, (java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException28);
        mathException14.addSuppressed((java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", objArray7, (java.lang.Throwable) derivativeException31);
        java.lang.Object[] objArray34 = mathException33.getArguments();
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException33);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
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
        boolean boolean12 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.reset();
        continuousOutputModel13.reset();
        continuousOutputModel5.append(continuousOutputModel13);
        double double17 = continuousOutputModel13.getFinalTime();
        boolean boolean18 = continuousOutputModel13.requiresDenseOutput();
        double double19 = continuousOutputModel13.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        double double7 = continuousOutputModel0.getInitialTime();
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        double double12 = continuousOutputModel9.getFinalTime();
        boolean boolean13 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        double double15 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double19 = continuousOutputModel18.getFinalTime();
        double double20 = continuousOutputModel18.getInitialTime();
        double double21 = continuousOutputModel18.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        continuousOutputModel18.append(continuousOutputModel22);
        double double26 = continuousOutputModel18.getFinalTime();
        boolean boolean27 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean28 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean29 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean30 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean31 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel18);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double34 = continuousOutputModel33.getFinalTime();
        double double35 = continuousOutputModel33.getInitialTime();
        double double36 = continuousOutputModel33.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double38 = continuousOutputModel37.getFinalTime();
        double double39 = continuousOutputModel37.getInitialTime();
        continuousOutputModel33.append(continuousOutputModel37);
        double double41 = continuousOutputModel33.getInitialTime();
        double double42 = continuousOutputModel33.getFinalTime();
        continuousOutputModel33.reset();
        continuousOutputModel9.append(continuousOutputModel33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException12 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = mathException14.getArguments();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray15, (java.lang.Throwable) mathException18);
        iOException7.addSuppressed((java.lang.Throwable) mathException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) mathException19);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) mathException19);
        java.lang.String str23 = mathException19.getPattern();
        java.lang.Throwable[] throwableArray24 = mathException19.getSuppressed();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray35);
        java.lang.String str40 = derivativeException39.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException39);
        java.lang.Object[] objArray42 = derivativeException39.getArguments();
        mathException19.addSuppressed((java.lang.Throwable) derivativeException39);
        java.io.IOException iOException44 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) mathException19);
        java.io.IOException iOException45 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException19);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str23, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "java.io.IOException: hi!" + "'", str40, "java.io.IOException: hi!");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[hi!, org.apache.commons.math.MathException: , hi!, org.apache.commons.math.MathException: , , ]");
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
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
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        continuousOutputModel13.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double19 = continuousOutputModel18.getFinalTime();
        double double20 = continuousOutputModel18.getInitialTime();
        boolean boolean21 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel18.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        continuousOutputModel18.append(continuousOutputModel23);
        continuousOutputModel13.append(continuousOutputModel23);
        boolean boolean28 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean29 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double31 = continuousOutputModel30.getFinalTime();
        double double32 = continuousOutputModel30.getInitialTime();
        boolean boolean33 = continuousOutputModel30.requiresDenseOutput();
        double double34 = continuousOutputModel30.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean36 = continuousOutputModel35.requiresDenseOutput();
        boolean boolean37 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel35.reset();
        boolean boolean39 = continuousOutputModel35.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel35.append(continuousOutputModel40);
        continuousOutputModel30.append(continuousOutputModel35);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean47 = continuousOutputModel46.requiresDenseOutput();
        double double48 = continuousOutputModel46.getInitialTime();
        boolean boolean49 = continuousOutputModel46.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean51 = continuousOutputModel50.requiresDenseOutput();
        boolean boolean52 = continuousOutputModel50.requiresDenseOutput();
        continuousOutputModel46.append(continuousOutputModel50);
        continuousOutputModel35.append(continuousOutputModel46);
        boolean boolean55 = continuousOutputModel46.requiresDenseOutput();
        continuousOutputModel46.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double58 = continuousOutputModel57.getFinalTime();
        double double59 = continuousOutputModel57.getInitialTime();
        double double60 = continuousOutputModel57.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double62 = continuousOutputModel61.getFinalTime();
        double double63 = continuousOutputModel61.getInitialTime();
        continuousOutputModel57.append(continuousOutputModel61);
        double double65 = continuousOutputModel57.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double67 = continuousOutputModel66.getFinalTime();
        double double68 = continuousOutputModel66.getInitialTime();
        boolean boolean69 = continuousOutputModel66.requiresDenseOutput();
        double double70 = continuousOutputModel66.getInitialTime();
        continuousOutputModel66.reset();
        boolean boolean72 = continuousOutputModel66.requiresDenseOutput();
        continuousOutputModel57.append(continuousOutputModel66);
        continuousOutputModel46.append(continuousOutputModel57);
        continuousOutputModel13.append(continuousOutputModel57);
        continuousOutputModel5.append(continuousOutputModel57);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel57.handleStep(stepInterpolator77, false);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
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
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
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
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray6);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException9);
        java.lang.Object[] objArray11 = mathException9.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: java.io.IOException: hi!", objArray11);
        java.lang.String str13 = mathException12.getPattern();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[org.apache.commons.math.MathException: org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[org.apache.commons.math.MathException: org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: hi!" + "'", str13, "java.io.IOException: java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
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
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        continuousOutputModel7.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        java.io.IOException iOException5 = new java.io.IOException();
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray6);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray19);
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray19, (java.lang.Throwable) iOException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) iOException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException30);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException30);
        java.lang.String str36 = mathException30.getPattern();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str36, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
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
        boolean boolean16 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean17 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator18, false);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        java.io.IOException iOException9 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException9);
        java.lang.Object[] objArray12 = mathException11.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        double double20 = continuousOutputModel16.getInitialTime();
        java.io.IOException iOException23 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException23);
        java.io.IOException iOException28 = new java.io.IOException("hi!");
        java.io.IOException iOException29 = new java.io.IOException("", (java.lang.Throwable) iOException28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException28);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double33 = continuousOutputModel32.getFinalTime();
        double double34 = continuousOutputModel32.getInitialTime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { double20, mathException25, iOException28, false, continuousOutputModel32 };
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("", strArray44);
        java.io.IOException iOException49 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException49);
        java.lang.Object[] objArray52 = mathException51.getArguments();
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray44, (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray35, (java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray12, (java.lang.Throwable) mathException55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("", objArray12);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException60);
        java.lang.Throwable[] throwableArray62 = iOException60.getSuppressed();
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!", objArray12, (java.lang.Throwable) iOException60);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", objArray12);
        java.lang.Object[] objArray65 = mathException64.getArguments();
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: java.io.IOException: ", objArray65);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
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
        java.lang.String str28 = mathException27.getPattern();
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException27);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray41);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException46);
        java.lang.Object[] objArray49 = mathException48.getArguments();
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray41, (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException51);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException51);
        mathException27.addSuppressed((java.lang.Throwable) derivativeException53);
        java.lang.Class<?> wildcardClass55 = derivativeException53.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.io.IOException: hi!" + "'", str28, "java.io.IOException: hi!");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", objArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
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
        double double11 = continuousOutputModel0.getInitialTime();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        java.io.IOException iOException6 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        derivativeException17.addSuppressed((java.lang.Throwable) iOException19);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) derivativeException17);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray8, (java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray8);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray8);
        java.lang.Throwable throwable32 = null;
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", objArray8, throwable32);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        double double8 = continuousOutputModel4.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        double double19 = continuousOutputModel17.getInitialTime();
        double double20 = continuousOutputModel17.getInitialTime();
        continuousOutputModel9.append(continuousOutputModel17);
        continuousOutputModel9.reset();
        continuousOutputModel4.append(continuousOutputModel9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
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
        double double17 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean25 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel24);
        continuousOutputModel19.append(continuousOutputModel24);
        boolean boolean28 = continuousOutputModel24.requiresDenseOutput();
        double double29 = continuousOutputModel24.getInitialTime();
        continuousOutputModel24.reset();
        continuousOutputModel24.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        double double35 = continuousOutputModel32.getFinalTime();
        boolean boolean36 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel32.reset();
        double double38 = continuousOutputModel32.getFinalTime();
        double double39 = continuousOutputModel32.getFinalTime();
        continuousOutputModel24.append(continuousOutputModel32);
        continuousOutputModel24.reset();
        continuousOutputModel24.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean44 = continuousOutputModel43.requiresDenseOutput();
        double double45 = continuousOutputModel43.getInitialTime();
        boolean boolean46 = continuousOutputModel43.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean48 = continuousOutputModel47.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel43.append(continuousOutputModel47);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double52 = continuousOutputModel51.getFinalTime();
        double double53 = continuousOutputModel51.getInitialTime();
        boolean boolean54 = continuousOutputModel51.requiresDenseOutput();
        double double55 = continuousOutputModel51.getInitialTime();
        continuousOutputModel51.reset();
        boolean boolean57 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel43.append(continuousOutputModel51);
        continuousOutputModel51.reset();
        continuousOutputModel24.append(continuousOutputModel51);
        continuousOutputModel9.append(continuousOutputModel51);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel62 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double63 = continuousOutputModel62.getFinalTime();
        double double64 = continuousOutputModel62.getInitialTime();
        boolean boolean65 = continuousOutputModel62.requiresDenseOutput();
        double double66 = continuousOutputModel62.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel67 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean68 = continuousOutputModel67.requiresDenseOutput();
        boolean boolean69 = continuousOutputModel67.requiresDenseOutput();
        continuousOutputModel67.reset();
        boolean boolean71 = continuousOutputModel67.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel72 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double73 = continuousOutputModel72.getFinalTime();
        double double74 = continuousOutputModel72.getInitialTime();
        boolean boolean75 = continuousOutputModel72.requiresDenseOutput();
        continuousOutputModel67.append(continuousOutputModel72);
        continuousOutputModel62.append(continuousOutputModel67);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel78 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean79 = continuousOutputModel78.requiresDenseOutput();
        double double80 = continuousOutputModel78.getInitialTime();
        boolean boolean81 = continuousOutputModel78.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel82 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean83 = continuousOutputModel82.requiresDenseOutput();
        boolean boolean84 = continuousOutputModel82.requiresDenseOutput();
        continuousOutputModel78.append(continuousOutputModel82);
        continuousOutputModel67.append(continuousOutputModel78);
        boolean boolean87 = continuousOutputModel78.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel88 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel88.reset();
        boolean boolean90 = continuousOutputModel88.requiresDenseOutput();
        double double91 = continuousOutputModel88.getInitialTime();
        continuousOutputModel78.append(continuousOutputModel88);
        continuousOutputModel88.reset();
        continuousOutputModel9.append(continuousOutputModel88);
        boolean boolean95 = continuousOutputModel9.requiresDenseOutput();
        double double96 = continuousOutputModel9.getInitialTime();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double96));
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
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
        continuousOutputModel0.reset();
        double double19 = continuousOutputModel0.getInitialTime();
        boolean boolean20 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = continuousOutputModel0.getInterpolatedTime();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.io.IOException iOException17 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        derivativeException15.addSuppressed((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) derivativeException15);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray6);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: hi!", objArray6);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException26);
        java.io.IOException iOException28 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException27);
        java.lang.Object[] objArray30 = mathException27.getArguments();
        java.io.IOException iOException34 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException34);
        java.io.IOException iOException37 = new java.io.IOException("", (java.lang.Throwable) mathException36);
        java.lang.String str38 = mathException36.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException36);
        mathException27.addSuppressed((java.lang.Throwable) derivativeException39);
        mathException22.addSuppressed((java.lang.Throwable) mathException27);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean13 = continuousOutputModel9.requiresDenseOutput();
        double double14 = continuousOutputModel9.getFinalTime();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel9.requiresDenseOutput();
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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double29 = continuousOutputModel28.getFinalTime();
        double double30 = continuousOutputModel28.getInitialTime();
        boolean boolean31 = continuousOutputModel28.requiresDenseOutput();
        continuousOutputModel28.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean34 = continuousOutputModel33.requiresDenseOutput();
        double double35 = continuousOutputModel33.getInitialTime();
        continuousOutputModel28.append(continuousOutputModel33);
        continuousOutputModel17.append(continuousOutputModel28);
        double double38 = continuousOutputModel28.getFinalTime();
        continuousOutputModel9.append(continuousOutputModel28);
        continuousOutputModel0.append(continuousOutputModel28);
        continuousOutputModel28.reset();
        double double42 = continuousOutputModel28.getInitialTime();
        double double43 = continuousOutputModel28.getInitialTime();
        continuousOutputModel28.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel9);
        continuousOutputModel9.reset();
        double double15 = continuousOutputModel9.getInitialTime();
        double double16 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        double double21 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        continuousOutputModel19.reset();
        continuousOutputModel9.append(continuousOutputModel19);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel25.reset();
        continuousOutputModel25.reset();
        boolean boolean30 = continuousOutputModel25.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getFinalTime();
        double double33 = continuousOutputModel31.getInitialTime();
        double double34 = continuousOutputModel31.getFinalTime();
        boolean boolean35 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel25.append(continuousOutputModel31);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean38 = continuousOutputModel37.requiresDenseOutput();
        boolean boolean39 = continuousOutputModel37.requiresDenseOutput();
        continuousOutputModel37.reset();
        continuousOutputModel37.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel42 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double43 = continuousOutputModel42.getFinalTime();
        double double44 = continuousOutputModel42.getInitialTime();
        boolean boolean45 = continuousOutputModel42.requiresDenseOutput();
        continuousOutputModel42.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean48 = continuousOutputModel47.requiresDenseOutput();
        double double49 = continuousOutputModel47.getInitialTime();
        continuousOutputModel42.append(continuousOutputModel47);
        continuousOutputModel37.append(continuousOutputModel47);
        continuousOutputModel37.reset();
        boolean boolean53 = continuousOutputModel37.requiresDenseOutput();
        double double54 = continuousOutputModel37.getFinalTime();
        continuousOutputModel25.append(continuousOutputModel37);
        boolean boolean56 = continuousOutputModel37.requiresDenseOutput();
        boolean boolean57 = continuousOutputModel37.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel37);
        continuousOutputModel0.append(continuousOutputModel9);
        boolean boolean60 = continuousOutputModel0.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double61 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        double double9 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel6.requiresDenseOutput();
        double double13 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        boolean boolean15 = continuousOutputModel6.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = continuousOutputModel6.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray16);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray35);
        java.io.IOException iOException43 = new java.io.IOException("hi!");
        java.io.IOException iOException44 = new java.io.IOException("", (java.lang.Throwable) iOException43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException43);
        java.io.IOException iOException46 = new java.io.IOException("hi!", (java.lang.Throwable) iOException43);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) iOException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray35, (java.lang.Throwable) mathException47);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray35);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) derivativeException50);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Object[]) strArray16, (java.lang.Throwable) derivativeException72);
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray16);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException75);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray65);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Object[]) throwableArray7);
        java.io.IOException iOException9 = new java.io.IOException();
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException9);
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
        java.lang.String str53 = mathException52.getPattern();
        java.lang.String str54 = mathException52.getPattern();
        java.io.IOException iOException55 = new java.io.IOException((java.lang.Throwable) mathException52);
        java.io.IOException iOException56 = new java.io.IOException((java.lang.Throwable) iOException55);
        java.io.IOException iOException59 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException59);
        java.lang.Object[] objArray62 = mathException61.getArguments();
        java.lang.Throwable[] throwableArray63 = mathException61.getSuppressed();
        java.lang.Throwable[] throwableArray64 = mathException61.getSuppressed();
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException61);
        iOException55.addSuppressed((java.lang.Throwable) mathException65);
        iOException9.addSuppressed((java.lang.Throwable) mathException65);
        java.lang.Object[] objArray68 = mathException65.getArguments();
        java.lang.String str69 = mathException65.getPattern();
        mathException8.addSuppressed((java.lang.Throwable) mathException65);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str53, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str54, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException15);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray10, (java.lang.Throwable) mathException17);
        java.lang.String str21 = mathException20.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException20);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException22);
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException23);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) mathException25);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str21, "org.apache.commons.math.MathException: hi!");
    }
}

